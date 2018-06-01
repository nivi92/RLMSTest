package com.rlms.model;

// Generated 2 Aug, 2014 1:44:14 PM by Hibernate Tools 4.0.0

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * CbUserRoles generated by hbm2java
 */
@Entity
@Table(name = "rlms_user_roles", uniqueConstraints = @UniqueConstraint(columnNames = {
		"role", "username" }))
public class RlmsUserRoles implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userRoleId;
	//private RlmsCompanyRoleMap rlmsCompanyRolMap;
	private RlmsUsersMaster rlmsUserMaster;
	private RlmsCompanyMaster rlmsCompanyMaster;
	private RlmsSpocRoleMaster rlmsSpocRoleMaster;
	private RlmsCompanyBranchMapDtls rlmsCompanyBranchMapDtls;
	private RlmsUserApplicationMapDtls rlmsUserApplicationMapDtls;
	private String username;
	private String role;
	private Integer activeFlag;
	private Date createdDate;
	private Integer createdBy;
	private Date updatedDate;
	private Integer updatedBy;
	
	
	public RlmsUserRoles() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_role_id", unique = true, nullable = false)
	public Integer getUserRoleId() {
		return userRoleId;
	}

	
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	/*@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "company_role_id")
	public RlmsCompanyRoleMap getRlmsCompanyRolMap() {
		return rlmsCompanyRolMap;
	}

	public void setRlmsCompanyRolMap(RlmsCompanyRoleMap rlmsCompanyRolMap) {
		this.rlmsCompanyRolMap = rlmsCompanyRolMap;
	}*/

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "user_id")
	public RlmsUsersMaster getRlmsUserMaster() {
		return rlmsUserMaster;
	}

	public void setRlmsUserMaster(RlmsUsersMaster rlmsUserMaster) {
		this.rlmsUserMaster = rlmsUserMaster;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "company_id")
	public RlmsCompanyMaster getRlmsCompanyMaster() {
		return rlmsCompanyMaster;
	}

	public void setRlmsCompanyMaster(RlmsCompanyMaster rlmsCompanyMaster) {
		this.rlmsCompanyMaster = rlmsCompanyMaster;
	}

	@Column(name = "active_flag", unique = true, nullable = false)
	public Integer getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Column(name = "created_date", unique = true, nullable = false)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "created_by", unique = true, nullable = false)
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "updated_date", unique = true, nullable = false)
	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Column(name = "updated_by", unique = true, nullable = false)
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "username", unique = true, nullable = true)
	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	@Column(name = "role", unique = true, nullable = true)
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "spoc_role_id")
	public RlmsSpocRoleMaster getRlmsSpocRoleMaster() {
		return rlmsSpocRoleMaster;
	}

	public void setRlmsSpocRoleMaster(RlmsSpocRoleMaster rlmsSpocRoleMaster) {
		this.rlmsSpocRoleMaster = rlmsSpocRoleMaster;
	}

	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "company_branch_map_id")
	public RlmsCompanyBranchMapDtls getRlmsCompanyBranchMapDtls() {
		return rlmsCompanyBranchMapDtls;
	}

	public void setRlmsCompanyBranchMapDtls(
			RlmsCompanyBranchMapDtls rlmsCompanyBranchMapDtls) {
		this.rlmsCompanyBranchMapDtls = rlmsCompanyBranchMapDtls;
	}
	
	/*@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "user_app_map_id")
	public RlmsUserApplicationMapDtls getRlmsUserApplicationMapDetails() {
		return rlmsUserApplicationMapDtls;
	}

	public void setRlmsUserApplicationMapDetails(
			RlmsUserApplicationMapDtls rlmsUserApplicationMapDtls) {
		this.rlmsUserApplicationMapDtls = rlmsUserApplicationMapDtls;
	}*/

}