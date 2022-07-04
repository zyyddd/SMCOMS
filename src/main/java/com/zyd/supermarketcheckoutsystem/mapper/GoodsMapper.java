package com.zyd.supermarketcheckoutsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.zyd.supermarketcheckoutsystem.pojo.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.Wrapper;
import java.util.Collection;
import java.util.Map;

/**
* @author 86183
* @description 针对表【goods】的数据库操作Mapper
* @createDate 2022-04-11 16:56:53
* @Entity com.zyd.supermarketcheckedsystem.pojo.Goods
*/
@Repository
public interface GoodsMapper extends BaseMapper<Goods> {

    @Insert("insert ignore into goods(price,resnum,goodname) value (#{goods.price},#{goods.resnum},#{goods.goodname})")
    int insert(@Param("goods") Goods goods);

    @Update("UPDATE goods set resnum = resnum - #{number} WHERE gid = #{gid}")
    Integer updateResnum(@Param("number") Integer number,@Param("gid") Integer gid);
}
