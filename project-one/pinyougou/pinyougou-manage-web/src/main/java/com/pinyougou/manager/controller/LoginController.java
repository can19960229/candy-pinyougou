package com.pinyougou.manager.controller;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2021/1/12 17:11
 * version 1.0
 * Description: 测试
 */

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录页管理
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/name")
    public Map name(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();//获得当前登录的用户名
        Map map = new HashMap<>();
        map.put("loginName",name);
        return map;
    }
}
