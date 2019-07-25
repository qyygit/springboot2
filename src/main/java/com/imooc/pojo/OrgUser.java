package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "org_user")
public class OrgUser {
    /**
     * 主键
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 工号
     */
    @Column(name = "user_empnumber")
    private String userEmpnumber;

    /**
     * 所属部门编码
     */
    @Column(name = "user_deptcode")
    private String userDeptcode;

    /**
     * 职务
     */
    @Column(name = "user_jobtitle")
    private String userJobtitle;

    /**
     * 人员姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 电子邮件
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 移动电话
     */
    @Column(name = "user_mobile")
    private String userMobile;

    /**
     * 固定电话
     */
    @Column(name = "user_telphone")
    private String userTelphone;

    @Column(name = "user_mainpage")
    private String userMainpage;

    @Column(name = "user_manager")
    private String userManager;

    /**
     * 排序列
     */
    @Column(name = "user_order")
    private Integer userOrder;

    /**
     * 删除状态
     */
    @Column(name = "user_del")
    private String userDel;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新人
     */
    @Column(name = "updated_by")
    private String updatedBy;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取主键
     *
     * @return user_id - 主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取工号
     *
     * @return user_empnumber - 工号
     */
    public String getUserEmpnumber() {
        return userEmpnumber;
    }

    /**
     * 设置工号
     *
     * @param userEmpnumber 工号
     */
    public void setUserEmpnumber(String userEmpnumber) {
        this.userEmpnumber = userEmpnumber;
    }

    /**
     * 获取所属部门编码
     *
     * @return user_deptcode - 所属部门编码
     */
    public String getUserDeptcode() {
        return userDeptcode;
    }

    /**
     * 设置所属部门编码
     *
     * @param userDeptcode 所属部门编码
     */
    public void setUserDeptcode(String userDeptcode) {
        this.userDeptcode = userDeptcode;
    }

    /**
     * 获取职务
     *
     * @return user_jobtitle - 职务
     */
    public String getUserJobtitle() {
        return userJobtitle;
    }

    /**
     * 设置职务
     *
     * @param userJobtitle 职务
     */
    public void setUserJobtitle(String userJobtitle) {
        this.userJobtitle = userJobtitle;
    }

    /**
     * 获取人员姓名
     *
     * @return user_name - 人员姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置人员姓名
     *
     * @param userName 人员姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取电子邮件
     *
     * @return user_email - 电子邮件
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置电子邮件
     *
     * @param userEmail 电子邮件
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取移动电话
     *
     * @return user_mobile - 移动电话
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 设置移动电话
     *
     * @param userMobile 移动电话
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    /**
     * 获取固定电话
     *
     * @return user_telphone - 固定电话
     */
    public String getUserTelphone() {
        return userTelphone;
    }

    /**
     * 设置固定电话
     *
     * @param userTelphone 固定电话
     */
    public void setUserTelphone(String userTelphone) {
        this.userTelphone = userTelphone;
    }

    /**
     * @return user_mainpage
     */
    public String getUserMainpage() {
        return userMainpage;
    }

    /**
     * @param userMainpage
     */
    public void setUserMainpage(String userMainpage) {
        this.userMainpage = userMainpage;
    }

    /**
     * @return user_manager
     */
    public String getUserManager() {
        return userManager;
    }

    /**
     * @param userManager
     */
    public void setUserManager(String userManager) {
        this.userManager = userManager;
    }

    /**
     * 获取排序列
     *
     * @return user_order - 排序列
     */
    public Integer getUserOrder() {
        return userOrder;
    }

    /**
     * 设置排序列
     *
     * @param userOrder 排序列
     */
    public void setUserOrder(Integer userOrder) {
        this.userOrder = userOrder;
    }

    /**
     * 获取删除状态
     *
     * @return user_del - 删除状态
     */
    public String getUserDel() {
        return userDel;
    }

    /**
     * 设置删除状态
     *
     * @param userDel 删除状态
     */
    public void setUserDel(String userDel) {
        this.userDel = userDel;
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新人
     *
     * @return updated_by - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}