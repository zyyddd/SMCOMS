package com.zyd.supermarketcheckoutsystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyd.supermarketcheckoutsystem.pojo.Customer;
import com.zyd.supermarketcheckoutsystem.service.CustomerService;
import com.zyd.supermarketcheckoutsystem.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 86183
* @description 针对表【customer】的数据库操作Service实现
* @createDate 2022-04-11 16:56:50
*/
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
implements CustomerService{

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public int addCustomer(Customer customer) {
        int result = customerMapper.insert(customer);
        System.out.println(result);
        return result;
    }

    @Override
    public int deleteCustomerByVipnum(Integer vipnum) {
        int result = customerMapper.deleteById(vipnum);
        return result;
    }

    @Override
    public int updateCustomerNameByVipnum(Customer customer) {
        int result = customerMapper.updateById(customer);
        return result;
    }

    @Override
    public Page<Customer> selectCustomerByPage(Page<Customer> page, QueryWrapper<Customer> queryWrapper) {
        Page<Customer> customerPage = customerMapper.selectPage(page, queryWrapper);
        return customerPage;
    }

    @Override
    public List<Customer> selectAll() {
        List<Customer> customers = customerMapper.selectList(null);
        return customers;
    }

    @Override
    public Customer selectByVipnum(Integer id) {
        Customer customer = customerMapper.selectById(id);
        return customer;
    }
}
