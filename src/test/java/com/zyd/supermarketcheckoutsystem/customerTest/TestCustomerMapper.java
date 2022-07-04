//-*- coding = utf-8 -*-
//@Time:2022/4/14 22:01
//@Author:ZYD
//@File:TestCustomerMapper.py
//@Software: IntelliJ IDEA

package com.zyd.supermarketcheckoutsystem.customerTest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyd.supermarketcheckoutsystem.mapper.CustomerMapper;
import com.zyd.supermarketcheckoutsystem.pojo.Customer;
import com.zyd.supermarketcheckoutsystem.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCustomerMapper {

    @Autowired
    CustomerService customerService;

    @Test
    void  testAddcustomer(){
        Customer customer = new Customer(1234,"小白");
        int result = customerService.addCustomer(customer);
        System.out.println(result);
    }

    @Test
    void testDeletecustomerByVipnum(){
        int i = customerService.deleteCustomerByVipnum(1234);
        System.out.println(i);
    }

    @Test
    void testUpdateCustomerNameById(){
        Customer customer = new Customer(10022,"郑郑郑郑");
        int i = customerService.updateCustomerNameByVipnum(customer);
        System.out.println(i);
    }

    @Test
    void testSelectCustomerByPage(){
        Page<Customer> page = new Page<>(1,3);
        Page<Customer> customerPage = customerService.selectCustomerByPage(page, null);
        System.out.println(customerPage.getRecords());
    }

}
