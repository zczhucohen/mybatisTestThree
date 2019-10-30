package com.zc.model.user;



import com.zc.model.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;

public class User extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String code;

    private String name;

    private String password;

    private String enterpriseId;

    private String phone;

    private String mobilephone;

    private String fax;

    private String email;

    private String address;

    private String remark;

    private String userId;

    private Long stopSign;

    private String createUser;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String supplierId;

    private String departmentId;


    private String signUser;

    private String enterpriseName;

    public User() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getStopSign() {
        return stopSign;
    }

    public void setStopSign(Long stopSign) {
        this.stopSign = stopSign;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSignUser() {
        return signUser;
    }

    public void setSignUser(String signUser) {
        this.signUser = signUser;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public User(String code, String name, String password, String enterpriseId, String phone, String mobilephone, String fax, String email, String address, String remark, String userId, Long stopSign, String createUser, Date createTime, String supplierId, String departmentId, String signUser, String enterpriseName) {
        this.code = code;
        this.name = name;
        this.password = password;
        this.enterpriseId = enterpriseId;
        this.phone = phone;
        this.mobilephone = mobilephone;
        this.fax = fax;
        this.email = email;
        this.address = address;
        this.remark = remark;
        this.userId = userId;
        this.stopSign = stopSign;
        this.createUser = createUser;
        this.createTime = createTime;
        this.supplierId = supplierId;
        this.departmentId = departmentId;
        this.signUser = signUser;
        this.enterpriseName = enterpriseName;
    }

    @Override
    public String toString() {
        return "User{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", enterpriseId='" + enterpriseId + '\'' +
                ", phone='" + phone + '\'' +
                ", mobilephone='" + mobilephone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                ", userId='" + userId + '\'' +
                ", stopSign=" + stopSign +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", supplierId='" + supplierId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", signUser='" + signUser + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                '}';
    }
}