package com.zyd.supermarketcheckoutsystem.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyd.supermarketcheckoutsystem.mapper.GoodsMapper;
import com.zyd.supermarketcheckoutsystem.pojo.Goods;
import com.zyd.supermarketcheckoutsystem.pojo.Order;
import com.zyd.supermarketcheckoutsystem.service.OrderService;
import com.zyd.supermarketcheckoutsystem.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;



/**
* @author 86183
* @description 针对表【order】的数据库操作Service实现
* @createDate 2022-04-11 16:56:56
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
implements OrderService{
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    GoodsMapper goodsMapper;
    
    @Override
    public Order selectOrderById(Integer oid) {
        Order order = orderMapper.selectById(oid);
        return  order;
    }

    @Override
    public int deleteOrderById(Integer id) {
        int result = orderMapper.deleteById(id);
        return result;
    }

    @Override
    public int addOrder(List<Goods> goods, Integer vipnum) {
        StringBuffer str  = new StringBuffer();
        for (int i = 0; i < goods.size();i++){
            Goods goods1 = goods.get(i);
            Integer gid = goods1.getGid();
            Integer number = goods1.getNumber();
            goodsMapper.updateResnum(number,gid);
            String s = goods1.toString();
            str.append(s);
        }
        String s = str.toString();
        Order order = new Order(null,s,vipnum);
        int result = orderMapper.insert(order);
        return result;
    }

    @Override
    public Page<Order> selectOrderByPage(Page<Order> page, QueryWrapper<Order> queryWrapper) {
        Page<Order> orderPage = orderMapper.selectPage(page, queryWrapper);
        return orderPage;
    }

    @Override
    public List<Order> selectAllOrder(QueryWrapper<Order> queryWrapper) {
        List<Order> orders = orderMapper.selectList(queryWrapper);
        return orders;
    }
}
