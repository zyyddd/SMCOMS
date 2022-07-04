//-*- coding = utf-8 -*-
//@Time:2022/4/18 19:48
//@Author:ZYD
//@File:CustomerControl.py
//@Software: IntelliJ IDEA

package com.zyd.supermarketcheckoutsystem.control;

import com.zyd.supermarketcheckoutsystem.pojo.Customer;
import com.zyd.supermarketcheckoutsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerControl {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getcustomermessage")
    public List<Customer> getCustomerMessage(){
        List<Customer> customers = customerService.selectAll();
        return customers;
    }

    @PostMapping("/addcustomer")
    public Integer addCustomer(@RequestBody Customer customer){
        int result = customerService.addCustomer(customer);
        return result;
    }

    @PutMapping("/updatecustomer")
    public Integer updatecustomer(@RequestBody Customer customer){
        int result = customerService.updateCustomerNameByVipnum(customer);
        return result;
    }

    @DeleteMapping("/deletecustomer")
    public Integer deletecustomer(@RequestParam("id") Integer id){
        int result = customerService.deleteCustomerByVipnum(id);
        return result;
    }
}
