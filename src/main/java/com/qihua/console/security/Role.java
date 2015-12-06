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
public class Role implements Serializable {

  private Long roleId;
  private String roleName = "";
  private List<Menu> items = new ArrayList<Menu>();

  public Role() {}

  public Role(Long roleId) {
    this.roleId = roleId;
  }

  public Role(Long roleId, String roleName) {
    this.roleId = roleId;
    this.roleName = roleName;
  }

  public Long getRoleId() {
    return roleId;
  }

  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
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

    return "Role [roleId=" + roleId + ", roleName=" + roleName + ", items=" + sb + "]";
  }

}
