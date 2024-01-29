package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Address;
import com.example.Entity.Order;
import com.example.Repository.AddressRepository;
import com.example.Repository.OrderRepository;

@RestController
public class OrderController {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private AddressRepository addressRepository;
	@PostMapping("/saveaddress")
	public String saveOrderWithAddress(@RequestBody Order order) {
		Address address=order.getAddress();
		addressRepository.save(address);
		orderRepository.save(order);
		return "saved successfully";
		
	}

}
