package com.onlineshop.customer.onlineShoppingserviceCustomer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshop.customer.onlineShoppingserviceCustomer.Entity.Customer;
import com.onlineshop.customer.onlineShoppingserviceCustomer.Entity.Employee;
import com.onlineshop.customer.onlineShoppingserviceCustomer.Entity.Test;
import com.onlineshop.customer.onlineShoppingserviceCustomer.Repository.TestRepo;
import com.onlineshop.customer.onlineShoppingserviceCustomer.Service.CustomerServiceProvider;
import com.onlineshop.customer.onlineShoppingserviceCustomer.Service.EmployeeService;

@RestController
public class CustomerServiceController {

	@Autowired
	CustomerServiceProvider customerService;
	
	@Autowired
	EmployeeService empSrv;
	
	@Autowired
	TestRepo trp;
	
	@GetMapping("/test/{id}")
	public Test getTest(@PathVariable("id") int id) {
		return trp.findById(id).get();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmp(@PathVariable("id") int id) {
		return empSrv.getEmployeeDetails(id);
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity< Customer> getCustomerDetails(@PathVariable("id") int id) {
		Customer res = customerService.getCustomer(id);
		
		
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
}
