//-*- coding = utf-8 -*-
//@Time:2022/4/18 23:04
//@Author:ZYD
//@File:OrderControl.py
//@Software: IntelliJ IDEA

package com.zyd.supermarketcheckoutsystem.control;


import com.zyd.supermarketcheckoutsystem.pojo.Customer;
import com.zyd.supermarketcheckoutsystem.pojo.Goods;
import com.zyd.supermarketcheckoutsystem.pojo.Order;
import com.zyd.supermarketcheckoutsystem.service.CustomerService;
import com.zyd.supermarketcheckoutsystem.service.GoodsService;
import com.zyd.supermarketcheckoutsystem.service.OrderService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class OrderControl {

    @Autowired
    OrderService orderService;
    @Autowired
    CustomerService customerService;
    @Autowired
    GoodsService goodsService;

    @GetMapping("/getallorder")
    public List<Order> getallorder(){
        List<Order> orders = orderService.selectAllOrder(null);
        return orders;
    }

    @DeleteMapping("/deleteorders")
    public Integer deleteOrder(@RequestParam("id") Integer id){
        int result = orderService.deleteOrderById(id);
        return result;
    }

    @PostMapping("/addorders")
    public Integer addOrder(@RequestBody Order order){
        return 0;
    }

    @GetMapping("/selectvipnum")
    public Customer selectvip(@RequestParam("vipnum") Integer vipnum){
        Customer customer = customerService.selectByVipnum(vipnum);
        return customer;
    }

    @GetMapping("/selectgoods")
    public Goods selectGoods(@RequestParam("gid") Integer gid){
        Goods goods = goodsService.selectGoodsById(gid);
        goods.setNumber(1);
        return goods;
    }

    @PostMapping("/addorder")
    public Integer addOrder(@RequestBody List<Goods> goods,
                            @RequestParam(value = "vipnum",required = false) Integer vipnum){

        int i = orderService.addOrder(goods, vipnum);
        return 1;
    }

}
