package com.onlineshop.customer.onlineShoppingserviceCustomer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.customer.onlineShoppingserviceCustomer.Entity.Employee;
import com.onlineshop.customer.onlineShoppingserviceCustomer.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	public Employee getEmployeeDetails(int id) {
		System.out.println("is it ok");
		return repo.findById(id).get();
	}
}
