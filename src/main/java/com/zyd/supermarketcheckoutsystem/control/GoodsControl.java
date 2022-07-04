//-*- coding = utf-8 -*-
//@Time:2022/4/18 1:24
//@Author:ZYD
//@File:GoodsControl.py
//@Software: IntelliJ IDEA

package com.zyd.supermarketcheckoutsystem.control;

import com.zyd.supermarketcheckoutsystem.pojo.Goods;
import com.zyd.supermarketcheckoutsystem.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GoodsControl {

    @Autowired
    GoodsService goodsService;

    @GetMapping("/getallgoods")
    public List<Goods> getAllGoods(){
        List<Goods> goods = goodsService.selectAllgoods(null);
        return goods;
    }

    @DeleteMapping("/deletegoods")
    public Integer deleteGoodsByid(@RequestParam("id") Integer id){
        int result = goodsService.deleteGoodsById(id);
        return result;
    }

    @PutMapping("/updategoods")
    public Integer updateGoods(@RequestBody Goods goods){
        int result = goodsService.updateGoods(goods);
        return result;
    }

    @PostMapping("addgoods")
    public Integer addGoods(@RequestBody Goods goods){
        int result = goodsService.insertGoods(goods);
        return result;
    }
}
