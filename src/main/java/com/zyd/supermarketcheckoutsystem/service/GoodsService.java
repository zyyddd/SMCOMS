package com.zyd.supermarketcheckoutsystem.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyd.supermarketcheckoutsystem.pojo.Goods;

import java.util.Collection;
import java.util.List;

/**
* @author 86183
* @description 针对表【goods】的数据库操作Service
* @createDate 2022-04-11 16:56:53
*/
public interface GoodsService extends IService<Goods> {
    /**
     * 添加商品
     * @param goods
     * @return
     */
    int insertGoods(Goods goods);

    /**
     * 根据物品id删除
     * @param id
     * @return
     */
    int deleteGoodsById(Integer id);

    /**
     * 根据物品id批量删除物品
     * @param ids
     * @return
     */
    int deleteGoodsBatch(Collection<Integer> ids);

    /**
     * 更新物品信息
     * @param good
     * @return
     */
    int updateGoods(Goods good);

    /**
     * 按照id查找物品
     * @param id
     * @return
     */
    Goods selectGoodsById(Integer id);

    /**
     * 查找所有商品
     * @return
     */
    List<Goods> selectAllgoods(QueryWrapper<Goods> queryWrapper);

    /**
     * 按照页码和querywrapper显示显示数据
     * @param page
     * @param queryWrapper
     * @return
     */
    Page<Goods> selectGoodsByPage(Page<Goods> page, QueryWrapper<Goods> queryWrapper);



}
