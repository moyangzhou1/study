package com.myz.study.dao;

import com.myz.study.domain.UserDto;
import com.myz.study.domain.UserDto1;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: mr.mo
 * @description
 * @date: 2018/8/31
 */
@Resource
public interface DemoDao {

    List<UserDto> getUserList();

    List<UserDto1> getUserList1();
}
