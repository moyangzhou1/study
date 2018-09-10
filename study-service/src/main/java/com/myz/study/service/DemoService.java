package com.myz.study.service;

import com.myz.study.domain.UserDto;
import com.myz.study.domain.UserDto1;

import java.util.List;

/**
 * @author: mr.mo
 * @description
 * @date: 2018/8/31
 */
public interface DemoService {

    List<UserDto> getUserList();
    List<UserDto1> getUserList1();
}
