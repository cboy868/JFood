package com.xueda.food.auth.model;

import java.io.Serializable;
import java.util.Date;

public class AuthRolePermissionsRel implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role_permissions_rel.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role_permissions_rel.role_id
     *
     * @mbg.generated
     */
    private String roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role_permissions_rel.permission_code
     *
     * @mbg.generated
     */
    private String permissionCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role_permissions_rel.created_at
     *
     * @mbg.generated
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_role_permissions_rel.updated_at
     *
     * @mbg.generated
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auth_role_permissions_rel
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role_permissions_rel.id
     *
     * @return the value of auth_role_permissions_rel.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role_permissions_rel.id
     *
     * @param id the value for auth_role_permissions_rel.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role_permissions_rel.role_id
     *
     * @return the value of auth_role_permissions_rel.role_id
     *
     * @mbg.generated
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role_permissions_rel.role_id
     *
     * @param roleId the value for auth_role_permissions_rel.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role_permissions_rel.permission_code
     *
     * @return the value of auth_role_permissions_rel.permission_code
     *
     * @mbg.generated
     */
    public String getPermissionCode() {
        return permissionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role_permissions_rel.permission_code
     *
     * @param permissionCode the value for auth_role_permissions_rel.permission_code
     *
     * @mbg.generated
     */
    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role_permissions_rel.created_at
     *
     * @return the value of auth_role_permissions_rel.created_at
     *
     * @mbg.generated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role_permissions_rel.created_at
     *
     * @param createdAt the value for auth_role_permissions_rel.created_at
     *
     * @mbg.generated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_role_permissions_rel.updated_at
     *
     * @return the value of auth_role_permissions_rel.updated_at
     *
     * @mbg.generated
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_role_permissions_rel.updated_at
     *
     * @param updatedAt the value for auth_role_permissions_rel.updated_at
     *
     * @mbg.generated
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_role_permissions_rel
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionCode=").append(permissionCode);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}