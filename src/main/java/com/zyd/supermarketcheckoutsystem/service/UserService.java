package com.zyd.supermarketcheckoutsystem.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyd.supermarketcheckoutsystem.pojo.User;

/**
* @author 86183
* @description 针对表【user】的数据库操作Service
* @createDate 2022-04-11 16:57:04
*/
public interface UserService extends IService<User> {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    User login(String username,String password);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int adduser(User user);


    /**
     * 修改用户密码或者名称
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     *
     * @param page
     * @param queryWrapper
     * @return
     */
    Page<User> selectUserByPage(Page<User> page, QueryWrapper<User> queryWrapper);

    /**
     * 根据id查找用户信息
     * @param id
     * @return
     */
    User selectUserByid(Integer id);
}
