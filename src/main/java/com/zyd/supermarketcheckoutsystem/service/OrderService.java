package com.zyd.supermarketcheckoutsystem.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.org.apache.xpath.internal.operations.Or;
import com.zyd.supermarketcheckoutsystem.pojo.Goods;
import com.zyd.supermarketcheckoutsystem.pojo.Order;

import java.util.List;
import java.util.Map;

/**
* @author 86183
* @description 针对表【order】的数据库操作Service
* @createDate 2022-04-11 16:56:56
*/
public interface OrderService extends IService<Order> {

    /**
     * 根据订单id查询该订单数据
     * @param oid
     * @return
     */
    Order selectOrderById(Integer oid);

    /**
     * 根据订单id删除订单
     * @param id
     * @return
     */
    int deleteOrderById(Integer id);

    /**
     * 将订单数据和对应的vipnum加入到订单中
     * @param
     * @param vipnum
     * @return
     */
    int addOrder(List<Goods> goods, Integer vipnum);


    Page<Order> selectOrderByPage(Page<Order> page, QueryWrapper<Order> queryWrapper);

    List<Order> selectAllOrder(QueryWrapper<Order> queryWrapper);


}
