package com.zyd.supermarketcheckoutsystem.userTest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyd.supermarketcheckoutsystem.mapper.UserMapper;
import com.zyd.supermarketcheckoutsystem.pojo.User;
import com.zyd.supermarketcheckoutsystem.service.UserService;
import com.zyd.supermarketcheckoutsystem.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserMapper {

    @Autowired
    UserService userService;

    @Test
    void testusermapper() {
        User user = userService.login("admin", "123");

        System.out.println(user);
    }

    @Test
    void testadd(){
        User user = new User(null,"zheng","123","zheng",0);
        int result = userService.adduser(user);
        System.out.println(result);
    }

    @Test
    void testupdate(){
        User user = new User(8,null,"123456","zyd",null);
        int result = userService.updateUser(user);
        System.out.println(result);
    }

    @Test
    void testdelete(){
        int i = userService.deleteUser(8);
        System.out.println(i);
    }

    @Test
    void testSelectUserByPage(){
        Page<User> page = new Page<>(1,3);
        Page<User> page1 = userService.selectUserByPage(page, null);
        System.out.println(page1.getCurrent());
        System.out.println(page1.getTotal());
        System.out.println(page1.getRecords());
    }

}
