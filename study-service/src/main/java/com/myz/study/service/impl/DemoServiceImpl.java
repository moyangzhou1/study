package com.myz.study.service.impl;

import com.myz.study.dao.DemoDao;
import com.myz.study.domain.UserDto;
import com.myz.study.domain.UserDto1;
import com.myz.study.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: mr.mo
 * @description
 * @date: 2018/8/31
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public List<UserDto> getUserList() {
        return demoDao.getUserList();
    }

    @Override
    public List<UserDto1> getUserList1() {
        return demoDao.getUserList1();
    }
}
