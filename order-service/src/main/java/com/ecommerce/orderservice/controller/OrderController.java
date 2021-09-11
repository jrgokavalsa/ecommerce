package com.ecommerce.orderservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@GetMapping(value = "/orders")
	public ResponseEntity<String>getAllOrders(){
		return ResponseEntity.status(HttpStatus.OK).body("All Orders From Order Service");
	}
}
