package com.ecommerce.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.userservice.feginclient.OrderClient;

@RestController
public class UserController {
	@Autowired
	OrderClient orderClient;
	
	@GetMapping(value = "/users")
	public ResponseEntity<String> getAllUsers(){
		return ResponseEntity.status(HttpStatus.OK).body("Users List from User Service");
	}
	
	@GetMapping(value="/orders")
	public ResponseEntity<String> getAllOrders(){
		return orderClient.getAllOrders();
	}
	
}
