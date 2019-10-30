package com.zc.controller;

import com.zc.model.user.User;
import com.zc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zhuochen
 * @comment
 * @date 2019/10/30
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("user!userOne/{code}")
    public List<User>  user(HttpServletRequest request,@PathVariable("code")String code){
        return userService.getUser(code);
    }

    @PostMapping ("user!userData/{code}")
    public List<User>  userData(HttpServletRequest request,@PathVariable("code")String code){
        System.out.println("---");
        return userService.getUser(code);
    }
}
