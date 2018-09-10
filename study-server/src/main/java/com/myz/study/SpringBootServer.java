package com.myz.study;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: mr.mo
 * @description
 * @date: 2018/8/23
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.myz.study.dao"})
@ComponentScan({"com.myz.study.server","com.myz.study.service"})
public class SpringBootServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootServer.class,args);
    }
}
