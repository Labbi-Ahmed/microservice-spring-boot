package com.onlineshop.customer.onlineShoppingserviceCustomer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineshop.customer.onlineShoppingserviceCustomer.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
