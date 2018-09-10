package com.myz.study.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author: mr.mo
 * @description
 * @date: 2018/8/31
 */
@Data
@ToString
public class UserDto1 {

    private Long id;
    private Long empId;
    private String userName;
    private String account;
    private String password;
    private Integer userType;
    private String mobile;
    private String email;
    private String headImg;
    private String status;
    private String dealerId;

}
