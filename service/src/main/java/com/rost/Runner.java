package com.rost;

import com.rost.dao.UserDao;
import com.rost.service.UserService;

import static java.lang.System.*;

public class Runner {
    public static void main(String[] args) {
        UserService userService = new UserService(new UserDao());
        out.println("Hello world");
        out.println(userService.getUser(1L));
    }
}
