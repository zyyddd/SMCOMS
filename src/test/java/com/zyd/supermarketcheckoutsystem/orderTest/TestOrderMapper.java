//-*- coding = utf-8 -*-
//@Time:2022/4/14 19:57
//@Author:ZYD
//@File:TestOrderMapper.py
//@Software: IntelliJ IDEA

package com.zyd.supermarketcheckoutsystem.orderTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyd.supermarketcheckoutsystem.pojo.Goods;
import com.zyd.supermarketcheckoutsystem.pojo.Order;
import com.zyd.supermarketcheckoutsystem.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class TestOrderMapper {
    @Autowired
    OrderService orderService;

//    @Test
//    void testSelectorderByid(){
//        Order order = orderService.selectOrderById(17);
//        String orderdetail = order.getOrderdetail();
//        Map<Object,Object> parse = (Map<Object,Object>) JSON.parse(orderdetail);
//        //1、遍历Map的办法(键和键值都能遍历)
////        for (Map.Entry map : parse.entrySet()){
////            System.out.println("key = " + map.getKey() + "values:" + map.getValue());
////        }
//        //2、遍历map中的value，但不能遍历key
////        for (Object p :parse.values()){
////            Map<String,String> map = (Map<String, String>) p;
////            System.out.println(map.get("goodname"));
////        }
//
////        3、map遍历，二次取值
//        for (Object key :  parse.keySet()){
//            System.out.println((String) key +  parse.get(key));
//        };
//
//    }

    @Test
    void testDeleteOrderByid(){
        int i = orderService.deleteOrderById(2);
        System.out.println(i);
    }



    @Test
    void testSelectOrderByPage(){
        Page<Order> page = new Page<>(1,3);
        Page<Order> orderPage = orderService.selectOrderByPage(page, null);
        System.out.println(orderPage.getRecords());
    }


}
