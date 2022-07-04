//-*- coding = utf-8 -*-
//@Time:2022/4/14 16:01
//@Author:ZYD
//@File:TsetGoodsMapper.py
//@Software: IntelliJ IDEA

package com.zyd.supermarketcheckoutsystem.goodTest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyd.supermarketcheckoutsystem.pojo.Goods;
import com.zyd.supermarketcheckoutsystem.service.GoodsService;
import com.zyd.supermarketcheckoutsystem.service.impl.GoodsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@SpringBootTest
public class TestGoodsMapper {
    @Autowired
    GoodsService goodsService;
    @Test
    void insertGoodsTest(){
        BigDecimal bigDecimal = new BigDecimal(20);
        Goods goods = new Goods(null,bigDecimal,1000,null,"铁汁");
        int i = goodsService.insertGoods(goods);
        System.out.println(i);
    }

    @Test
    void TestdeleteGoodsByid(){
        int i = goodsService.deleteGoodsById(2);
        System.out.println(i);
    }

    @Test
    void TestdeleteGoodsBatch(){
        List<Integer> integers = Arrays.asList(3, 4);
        int i = goodsService.deleteGoodsBatch(integers);
        System.out.println(i);
    }

    @Test
    void Testupdategoods(){
        BigDecimal price = new BigDecimal(233);
        Goods goods = new Goods(3,price,99,null,"辣条plus");
        goodsService.updateGoods(goods);
    }

    @Test
    void testselectgoodsById(){
        Goods goods = goodsService.selectGoodsById(3);
        System.out.println(goods);

    }

    @Test
    void testselectAllgood(){
        List<Goods> goods = goodsService.selectAllgoods(null);
        goods.forEach(System.out::println);
    }

    @Test
    void testselectgoodByPage(){
        Page<Goods> page =new  Page<>(2,3);
        goodsService.selectGoodsByPage(page,null);
    }



}
