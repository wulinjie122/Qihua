package com.qihua.front.product;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qihua.common.PageModel;
import com.qihua.exception.NullObjectException;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private CategoryService categoryService;;

    public List<Product> find() {
        return productDAO.select();
    }

    public PageModel<Product> search(ProductQueryParameter queryParam) {
        PageModel<Product> pageModel = productDAO.selectByPagination(queryParam);
        List<Product> list = pageModel.getContent();
        for (Product item : list) {
            item.setImages(productDAO.selectProductImg(item.getProductId()));
        }

        return pageModel;
    }

    public Product find(String productId) throws NullObjectException {
        try {
            Product product = productDAO.select(productId);
            product.setCategory(categoryService.findSubcategory(product.getCategoryId()));
            product.setImages(productDAO.selectProductImg(productId));

            return product;
        } catch (DataAccessException e) {
            throw new NullObjectException();
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public Product save(Product item) throws Exception {
        if (StringUtils.isEmpty(item.getProductId())) {
            return productDAO.insert(item);
        }

        return productDAO.update(item);
    }

    public List<Product> findHottest() {
        List<Product> list = productDAO.selectHottest();
        for (Product item : list) {
            item.setImages(productDAO.selectProductImg(item.getProductId()));
        }

        return list;
    }

    public List<Product> findByScore(int lowScore, int highScore) {
        List<Product> list = productDAO.selectByScore(lowScore, highScore);
        for (Product item : list) {
            item.setImages(productDAO.selectProductImg(item.getProductId()));
        }

        return list;
    }

    public List<ProductImg> findRecommendImg() {
        return productDAO.selectRecommendImg();
    }

    public Product findFlashSaleProduct() {
        Product product;

        try {
            product = productDAO.selectFlashSaleProduct();
            product.setFlashSaleImages(productDAO.selectFlashSaleImg(product.getProductId()));
        } catch (DataAccessException e) {
            return new Product();
        }

        return product;
    }

    public ProductImg findImgBlock(String position) {
        try {
            return productDAO.selectImgBlock(position);
        } catch (DataAccessException e) {
            return new ProductImg();
        }
    }
}
