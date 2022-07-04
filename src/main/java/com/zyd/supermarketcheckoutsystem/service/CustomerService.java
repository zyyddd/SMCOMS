package com.zyd.supermarketcheckoutsystem.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyd.supermarketcheckoutsystem.pojo.Customer;

import java.util.List;

/**
* @author 86183
* @description 针对表【customer】的数据库操作Service
* @createDate 2022-04-11 16:56:50
*/
public interface CustomerService extends IService<Customer> {

    /**
     * 添加会员
     * @param customer
     * @return
     */
    int addCustomer(Customer customer);


    /**
     * 根据vipnum删除会员的信息
     * @param vipnum
     * @return
     */
    int deleteCustomerByVipnum(Integer vipnum);

    /**
     * 修改客户的信息
     * @param customer
     * @return
     */
    int updateCustomerNameByVipnum(Customer customer);

    /**
     * 分页查询顾客信息
     * @param page
     * @param queryWrapper
     * @return
     */
    Page<Customer> selectCustomerByPage(Page<Customer> page, QueryWrapper<Customer> queryWrapper);


    List<Customer> selectAll();


    Customer selectByVipnum(Integer vipnum);
}
