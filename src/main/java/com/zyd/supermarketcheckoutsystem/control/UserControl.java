//-*- coding = utf-8 -*-
//@Time:2022/4/16 23:11
//@Author:ZYD
//@File:UserControl.py
//@Software: IntelliJ IDEA

package com.zyd.supermarketcheckoutsystem.control;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyd.supermarketcheckoutsystem.pojo.User;
import com.zyd.supermarketcheckoutsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserControl {

    @Autowired
    UserService userService;

    @GetMapping("/getUsermessage")
    public Page<User> getUsermessage(@RequestParam("current") Integer current){
        Page<User> page = new Page<>(current,100);
        Page<User> resultPage = userService.selectUserByPage(page, null);
        return resultPage;
    }

    @DeleteMapping("/deleteUser")
    public Integer deleteUser(@RequestParam("id") Integer id){
        int i = userService.deleteUser(id);
        return i;
    }

    @RequestMapping(value = "/updateuser",method = RequestMethod.PUT)
    public Integer updateUser(@RequestBody User user){
        System.out.println(user);
        int i = userService.updateUser(user);

        return i;
    }

    @PostMapping("/adduser")
    public Integer addUser(@RequestBody User user){
        int result = userService.adduser(user);
        return result;

    }
}
