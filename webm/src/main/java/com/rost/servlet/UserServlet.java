package com.rost.servlet;

import com.rost.dto.UserDto;
import com.rost.service.UserService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

import static java.lang.System.out;

@RequiredArgsConstructor
public class UserServlet extends HttpServlet {

    private final UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        Optional<UserDto> user = userService.getUser(1L);
        out.println("We have a user " + user + " !");
    }
}
