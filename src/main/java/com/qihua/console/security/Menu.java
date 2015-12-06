package com.qihua.console.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Class description goes here.
 * 
 * @author aopfilter@163.com
 * @since 2013-10-11
 * @version 1.0
 * @see
 */
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long menuId;
    private Long parentId;
    private String menuName;
    private String menuUrl;
    private List<Menu> items = new ArrayList<Menu>();

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public List<Menu> getItems() {
        return items;
    }

    public void setItems(List<Menu> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Menu item : items) {
            sb.append(item);
        }

        return "Menu [menuId=" + menuId + ", parentId=" + parentId + ", menuName=" + menuName + ", menuUrl=" + menuUrl + ", items=" + sb + "]";
    }

}
