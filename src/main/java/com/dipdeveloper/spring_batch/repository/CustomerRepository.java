package com.dipdeveloper.spring_batch.repository;

import com.dipdeveloper.spring_batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
