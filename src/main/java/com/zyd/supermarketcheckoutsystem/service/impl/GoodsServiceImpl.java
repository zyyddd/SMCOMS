package com.zyd.supermarketcheckoutsystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyd.supermarketcheckoutsystem.pojo.Goods;
import com.zyd.supermarketcheckoutsystem.service.GoodsService;
import com.zyd.supermarketcheckoutsystem.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
* @author 86183
* @description 针对表【goods】的数据库操作Service实现
* @createDate 2022-04-11 16:56:53
*/
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods>
implements GoodsService{

    @Autowired
    GoodsMapper goodsMapper;

    /**
     * 增加商品
     */
    @Override
    public int insertGoods(Goods goods){
        int insert = goodsMapper.insert(goods);
        return insert;
    }

    /**
     * 根据id删除商品
     */
    @Override
    public int deleteGoodsById(Integer id){
        int result = goodsMapper.deleteById(id);
        return result;
    }

    /**
     *根据id批量删除
     */
    @Override
    public int deleteGoodsBatch(Collection<Integer> ids){
        int result = goodsMapper.deleteBatchIds(ids);
        return result;
    }

    /**
     * 修改商品信息
     * @param good
     * @return
     */
    @Override
    public int updateGoods(Goods good){
        int i = goodsMapper.updateById(good);
        return i;
    }


    /**
     * 根据id找出商品
     * @param id
     * @return
     */
    @Override
    public Goods selectGoodsById(Integer id){
        Goods goods = goodsMapper.selectById(id);
        return goods;
    }

    @Override
    public List<Goods> selectAllgoods(QueryWrapper<Goods> queryWrapper) {
        List<Goods> goods = goodsMapper.selectList(null);
        return goods;
    }

    @Override
    public Page<Goods> selectGoodsByPage(Page<Goods> page,QueryWrapper<Goods> queryWrapper) {
        Page<Goods> goodsPage = goodsMapper.selectPage(page, null);
        return goodsPage;
    }


}
