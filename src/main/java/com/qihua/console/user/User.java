package com.qihua.console.user;

import com.qihua.common.BaseEntity;
import com.qihua.common.annotation.ExcludeColumn;
import com.qihua.common.annotation.GeneratedValue;
import com.qihua.common.annotation.NotNull;
import com.qihua.common.annotation.PrimaryKey;
import com.qihua.console.security.Role;

/**
 * Class description goes here.
 * 
 * @author aopfilter@163.com
 * @since Jan 21, 2015 2:06:15 PM
 * @version 1.0
 * 
 */
public class User extends BaseEntity {

    @PrimaryKey
    @GeneratedValue(generator = "uuid")
    private String userId;
    @NotNull
    private String username = "";
    @NotNull
    private String password;
    @NotNull
    private String realName = "";
    @NotNull
    private String mobile = "";
    @NotNull
    private String email = "";
    private String description = "";
    @ExcludeColumn
    private Role role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username + ", realName=" + realName + ", mobile=" + mobile + ", email=" + email + "]";
    }

}
