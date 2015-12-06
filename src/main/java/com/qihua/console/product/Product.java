package com.qihua.console.product;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.qihua.common.BaseEntity;
import com.qihua.common.annotation.ExcludeColumn;
import com.qihua.common.annotation.GeneratedValue;
import com.qihua.common.annotation.NotNull;
import com.qihua.common.annotation.PrimaryKey;

/**
 * Class description goes here.
 *
 * @author aopfilter@163.com
 * @since Jan 21, 2015 2:06:15 PM
 * @version 1.0
 * @see
 */
public class Product extends BaseEntity {

    @PrimaryKey
    @GeneratedValue(generator = "uuid")
    private String productId;
    @NotNull
    private String productCode = "";
    @NotNull
    private String productName = "";
    private double price;
    @NotNull
    private long score;
    private int rate = 3;
    private int isRecommend = 1; // 由于 Bootstrap Switch 开关关时不传值，所以默认为关闭。
    private int isFlashSale = 1;
    private Date onSaleDate = new Date(System.currentTimeMillis());
    private int countdown;
    @ExcludeColumn
    private String categoryName;
    @NotNull
    private Long categoryId;
    @ExcludeColumn
    private Long subcategoryId;
    @ExcludeColumn
    private String subcategoryName;
    private String description = "";
    private List<ProductImg> images = new ArrayList<ProductImg>();
    private List<ProductImg> recommendImages = new ArrayList<ProductImg>();
    private List<ProductImg> flashSaleImages = new ArrayList<ProductImg>();

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(int isRecommend) {
        this.isRecommend = isRecommend;
    }

    public int getIsFlashSale() {
        return isFlashSale;
    }

    public void setIsFlashSale(int isFlashSale) {
        this.isFlashSale = isFlashSale;
    }

    public Date getOnSaleDate() {
        return onSaleDate;
    }

    public void setOnSaleDate(Date onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    public int getCountdown() {
        return countdown;
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Long subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductImg> getImages() {
        return images;
    }

    public void setImages(List<ProductImg> images) {
        this.images = images;
    }

    public List<ProductImg> getRecommendImages() {
        return recommendImages;
    }

    public void setRecommendImages(List<ProductImg> recommendImages) {
        this.recommendImages = recommendImages;
    }

    public List<ProductImg> getFlashSaleImages() {
        return flashSaleImages;
    }

    public void setFlashSaleImages(List<ProductImg> flashSaleImages) {
        this.flashSaleImages = flashSaleImages;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productCode=" + productCode + ", productName=" + productName
                + ", price=" + price + ", score=" + score + ", rate=" + rate + ", isRecommend=" + isRecommend
                + ", isFlashSale=" + isFlashSale + ", onSaleDate=" + onSaleDate + ", countdown=" + countdown
                + ", categoryName=" + categoryName + ", categoryId=" + categoryId + ", subcategoryId=" + subcategoryId
                + ", subcategoryName=" + subcategoryName + ", description=" + description + ", images=" + images
                + ", recommendImages=" + recommendImages + ", flashSaleImages=" + flashSaleImages + "]";
    }

}
