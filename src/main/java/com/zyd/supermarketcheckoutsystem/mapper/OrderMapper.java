package com.zyd.supermarketcheckoutsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyd.supermarketcheckoutsystem.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
* @author 86183
* @description 针对表【order】的数据库操作Mapper
* @createDate 2022-04-11 16:56:56
* @Entity com.zyd.supermarketcheckedsystem.pojo.Order
*/
@Repository
public interface OrderMapper extends BaseMapper<Order> {



}
