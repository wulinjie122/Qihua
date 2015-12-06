package com.qihua.console.product;

import com.qihua.common.BaseEntity;
import com.qihua.common.annotation.NotNull;
import com.qihua.common.annotation.PrimaryKey;
import com.qihua.common.annotation.Table;

/**
 * Class description goes here.
 *
 * @author aopfilter@163.com
 * @since Jan 21, 2015 2:06:15 PM
 * @version 1.0
 *
 */
@Table(name = "t_product_category")
public class Category extends BaseEntity {

    @PrimaryKey
    private Long categoryId;
    @NotNull
    private String categoryName = "";
    @NotNull
    private String subcategoryId = "";
    @NotNull
    private String subcategoryName = "";

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(String subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

}
