package com.zyd.supermarketcheckoutsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyd.supermarketcheckoutsystem.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
* @author 86183
* @description 针对表【customer】的数据库操作Mapper
* @createDate 2022-04-11 16:56:50
* @Entity com.zyd.supermarketcheckedsystem.pojo.Customer
*/
@Repository
public interface CustomerMapper extends BaseMapper<Customer> {

}
