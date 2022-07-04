package com.zyd.supermarketcheckoutsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyd.supermarketcheckoutsystem.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
* @author 86183
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-04-11 16:57:04
* @Entity com.zyd.supermarketcheckedsystem.pojo.User
*/
@Repository
public interface UserMapper extends BaseMapper<User> {

    //登录功能
    @Select("select * from user where username = #{username} and password = #{password}")
    User login(@Param("username") String username , @Param("password") String password);

    //添加用户
    @Insert("insert into user(username,password,name,rid) select  #{user.username},#{user.password}," +
            "#{user.name},#{user.rid} from dual where not exists (select 1 from user where username=#{user.username} )")
    int addUser(@Param("user") User user);

    //修改用户密码或者姓名
    @Update("update user set  password = #{user.password},name = #{user.name} where uid = #{user.uid}")
    int updateUser(@Param("user")User user);

    /**
     * 删除用户
     */
    @Delete("delete from user where uid = #{uid}")
    int deleteUser(@Param("uid") Integer uid);
}
