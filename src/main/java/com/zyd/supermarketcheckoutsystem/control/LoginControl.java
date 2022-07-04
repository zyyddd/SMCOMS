//-*- coding = utf-8 -*-
//@Time:2022/4/15 23:38
//@Author:ZYD
//@File:LoginControl.py
//@Software: IntelliJ IDEA

package com.zyd.supermarketcheckoutsystem.control;


import com.zyd.supermarketcheckoutsystem.pojo.User;
import com.zyd.supermarketcheckoutsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginControl {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public User login(@RequestParam("username") String username,
                     @RequestParam("password") String password){
        User loginUser = userService.login(username, password);
        return loginUser;
    }

    @GetMapping("getloginMessage")
    public User getUserMessage(@RequestParam("uid") Integer uid){
        User user = userService.selectUserByid(uid);
        return user;
    }
}
