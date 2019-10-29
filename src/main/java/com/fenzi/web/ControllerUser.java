package com.fenzi.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName:com.fenzi.web Description
 * @author:王朝阳
 * @date:2019/10/29
 */
@RestController("/user")
public class ControllerUser {

    @RequestMapping("/index")
    public String index(){
        return "hello world";
    }
}
