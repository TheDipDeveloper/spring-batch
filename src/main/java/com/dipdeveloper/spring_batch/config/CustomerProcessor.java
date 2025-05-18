package com.dipdeveloper.spring_batch.config;

import com.dipdeveloper.spring_batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        /*
        if("2020-08-26".equals(customer.getSubscriptionDate())){
            return customer;
        }else{
            return null;
        }
         */
        return customer;
    }
}
