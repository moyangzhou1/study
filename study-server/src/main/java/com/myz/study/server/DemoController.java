package com.myz.study.server;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.*;
import com.myz.study.common.AliyunOssUtils;
import com.myz.study.domain.UserDto;
import com.myz.study.domain.UserDto1;
import com.myz.study.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;
import java.util.List;

/**
 * @author: mr.mo
 * @description
 * @date: 2018/8/29
 */
@Controller
//@RestController
@Slf4j
public class DemoController {
    // endpoint是访问OSS的域名。如果您已经在OSS的控制台上 创建了Bucket，请在控制台上查看域名。
    // 如果您还没有创建Bucket，endpoint选择请参看文档中心的“开发人员指南 > 基本概念 > 访问域名”，
    // 链接地址是：https://help.aliyun.com/document_detail/oss/user_guide/oss_concept/endpoint.html?spm=5176.docoss/user_guide/endpoint_region
    // endpoint的格式形如“http://oss-cn-hangzhou.aliyuncs.com/”，注意http://后不带bucket名称，
    // 比如“http://bucket-name.oss-cn-hangzhou.aliyuncs.com”，是错误的endpoint，请去掉其中的“bucket-name”。
    private static String endpoint = "oss-cn-shenzhen.aliyuncs.com";

    // accessKeyId和accessKeySecret是OSS的访问密钥，您可以在控制台上创建和查看，
    // 创建和查看访问密钥的链接地址是：https://ak-console.aliyun.com/#/。
    // 注意：accessKeyId和accessKeySecret前后都没有空格，从控制台复制时请检查并去除多余的空格。

    //子accessKeyId
    private static String accessKeyId = "LTAIPEZ0ErZNsHmh";
    private static String accessKeySecret = "p0rih0hrXB1VUmzr4sDB4Zri5KkSak";

    // Bucket用来管理所存储Object的存储空间，详细描述请参看“开发人员指南 > 基本概念 > OSS基本概念介绍”。
    // Bucket命名规范如下：只能包括小写字母，数字和短横线（-），必须以小写字母或者数字开头，长度必须在3-63字节之间。
    private static String bucketName = "myz-file-oss";

    // Object是OSS存储数据的基本单元，称为OSS的对象，也被称为OSS的文件。详细描述请参看“开发人员指南 > 基本概念 > OSS基本概念介绍”。
    // Object命名规范如下：使用UTF-8编码，长度必须在1-1023字节之间，不能以“/”或者“\”字符开头。
    //private static String firstKey = "myz-file-oss";



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


    @RequestMapping(value = "/fileUp",method = RequestMethod.POST)
    public void fileUpLoad(@RequestBody MultipartFile file){
//        file.
//
//
//
//        File f = fi.getStoreLocation();
//
//
//
//        AliyunOssUtils.oosFileUpLoad(file);
//
//        file.getName();
//        file.getOriginalFilename();
//        file.getContentType();

        System.out.println("shangchuanchengong");
    }



















































}
