package com.myz.study.domain;

import java.util.Objects;

/**
 * @author: mr.mo
 * @description
 * @date: 2018/8/31
 */

public class UserDto {

    private Long id;
    private Long empId;
    private String userName;
    private String account;
    private String password;
    private Integer userType;
    private String mobile;
    private String email;
    private String head_img;
    private Integer status;
    private Long dealerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHead_img() {
        return head_img;
    }

    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDto userDto = (UserDto) o;
        return Objects.equals(id, userDto.id) &&
                Objects.equals(empId, userDto.empId) &&
                Objects.equals(userName, userDto.userName) &&
                Objects.equals(account, userDto.account) &&
                Objects.equals(password, userDto.password) &&
                Objects.equals(userType, userDto.userType) &&
                Objects.equals(mobile, userDto.mobile) &&
                Objects.equals(email, userDto.email) &&
                Objects.equals(head_img, userDto.head_img) &&
                Objects.equals(status, userDto.status) &&
                Objects.equals(dealerId, userDto.dealerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, empId, userName, account, password, userType, mobile, email, head_img, status, dealerId);
    }


    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", empId=" + empId +
                ", userName='" + userName + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", head_img='" + head_img + '\'' +
                ", status=" + status +
                ", dealerId=" + dealerId +
                '}';
    }
}
