package com.nero.java.proxy;

import com.nero.java.proxy.service.UserServiceIml;

public class Main {

    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServiceIml());
        System.out.println(userServiceProxy.getName());
    }
}
