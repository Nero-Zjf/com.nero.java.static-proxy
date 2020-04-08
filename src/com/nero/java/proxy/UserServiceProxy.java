package com.nero.java.proxy;

import com.nero.java.proxy.service.UserService;

/**
 * 静态代理类
 */
public class UserServiceProxy implements UserService {
    //代理的目标对象
    public UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getName() {
        System.out.println("代理类getName方法执行");
        return userService.getName();
    }
}
