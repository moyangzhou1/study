package com.myz.study.server;

import com.myz.study.domain.UserDto;
import com.myz.study.domain.UserDto1;
import com.myz.study.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: mr.mo
 * @description
 * @date: 2018/8/29
 */
@Controller
//@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;


    /**
     * spring thymeleaf 返回视图
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(){
        return "index";
    }

    /**
     * Controller、ResponseBody合用
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public List<UserDto> sayHi1(){
        return demoService.getUserList();
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public List<UserDto1> sayHi2(){
        return demoService.getUserList1();
    }





}
