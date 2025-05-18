package com.dipdeveloper.spring_batch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMERS_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "COMPANY")
    private String company;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "PHONE_1")
    private String phone1;
    @Column(name = "PHONE_2")
    private String phone2;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SUBSCRIPTION_DATE")
    private String subscriptionDate;
    @Column(name = "WEBSITE")
    private String website;
}
