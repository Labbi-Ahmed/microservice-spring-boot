package com.onlineshop.customer.onlineShoppingserviceCustomer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshop.customer.onlineShoppingserviceCustomer.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
