package com.qihua.console.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.qihua.common.BaseEntity;
import com.qihua.common.Constants;
import com.qihua.common.annotation.PrimaryKey;

/**
 * 产品图片
 *
 * @since 2014-3-20
 * @author zhen.ni
 * @email: aopfilter@163.com
 */
@JsonIgnoreProperties({ "productId" })
public class ProductImg extends BaseEntity {

    @PrimaryKey
    private String name;
    private long size;
    private String extension;
    private String productId;
    private String postion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getImgUrl() {
        return Constants.CONTEXT_URL + Constants.PRODUCT_IMG_URL + getName() + "." + getExtension();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

}
