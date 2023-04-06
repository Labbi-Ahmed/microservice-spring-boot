package com.onlineshop.customer.onlineShoppingserviceCustomer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshop.customer.onlineShoppingserviceCustomer.Entity.Customer;
import com.onlineshop.customer.onlineShoppingserviceCustomer.Repository.CustomerRepo;
import com.onlineshop.customer.onlineShoppingserviceCustomer.ResponseC.CustomerResponse;
@Service
public class CustomerServiceProvider {

	@Autowired
	CustomerRepo repo;
	
	public CustomerResponse getCustomer(int id) {
		// TODO Auto-generated method stub
		Customer customer =  repo.findById(id).get();
		
		return new CustomerResponse();
		
		//return null;
	}

}
