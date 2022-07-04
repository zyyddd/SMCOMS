package com.zyd.supermarketcheckoutsystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyd.supermarketcheckoutsystem.pojo.User;
import com.zyd.supermarketcheckoutsystem.service.UserService;
import com.zyd.supermarketcheckoutsystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
* @author 86183
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-04-11 16:57:04
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

    @Autowired
    UserMapper usermapper;
    /*登录*/
    @Override
    public User login(String username, String password){
        User user = usermapper.login(username, password);
        if (user!=null){
            return user;
        }
        return null;

    }

    /*添加用户成功返回1，失败返回0*/
    @Override
    public int adduser(User user){
        int result = usermapper.addUser(user);

        return result;
    }


    /**
     * 修改用户密码或者名称
     */
    @Override
    public int updateUser(User user){
        int result = usermapper.updateUser(user);
        return result;
    }

    /**
     * 删除用户
     */
    @Override
    public int deleteUser(Integer id){
        int result = usermapper.deleteUser(id);
        return result;
    }

    @Override
    public Page<User> selectUserByPage(Page<User> page, QueryWrapper<User> queryWrapper) {
        Page<User> userPage = usermapper.selectPage(page, queryWrapper);
        return userPage;

    }

    @Override
    public User selectUserByid(Integer id) {

        User user = usermapper.selectById(id);
        return user;
    }
}
