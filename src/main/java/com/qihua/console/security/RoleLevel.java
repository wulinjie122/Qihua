package com.qihua.console.security;

import java.io.Serializable;

/**
 * Class description goes here.
 * 
 * @author aopfilter@163.com
 * @since 2013-10-11
 * @version 1.0
 * @see
 */
public class RoleLevel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long roleId;
	private String roleName = "";
	private long roleLevelId;
	private String roleLevelName = "";

	public RoleLevel() {
	}

	public RoleLevel(long roleLevelId, String roleLevelName) {
		this.roleLevelId = roleLevelId;
		this.roleLevelName = roleLevelName;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public long getRoleLevelId() {
		return roleLevelId;
	}

	public void setRoleLevelId(long roleLevelId) {
		this.roleLevelId = roleLevelId;
	}

	public String getRoleLevelName() {
		return roleLevelName;
	}

	public void setRoleLevelName(String roleLevelName) {
		this.roleLevelName = roleLevelName;
	}

}
