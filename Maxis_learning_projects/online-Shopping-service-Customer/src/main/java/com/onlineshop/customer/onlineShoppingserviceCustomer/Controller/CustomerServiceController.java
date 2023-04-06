package com.onlineshop.customer.onlineShoppingserviceCustomer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshop.customer.onlineShoppingserviceCustomer.ResponseC.CustomerResponse;
import com.onlineshop.customer.onlineShoppingserviceCustomer.Service.CustomerServiceProvider;

@RestController
public class CustomerServiceController {

	@Autowired
	CustomerServiceProvider customerService;
	
	@GetMapping("/costomer/{id}")
	public ResponseEntity< CustomerResponse> getCustomerDetails(@PathVariable("id") int id) {
		CustomerResponse res = customerService.getCustomer(id);
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
}
