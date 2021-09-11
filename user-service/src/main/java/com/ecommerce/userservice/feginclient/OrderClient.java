package com.ecommerce.userservice.feginclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "http://ORDER-SERVICE/")
public interface OrderClient {
	@GetMapping(value = "/orders")
	public ResponseEntity<String>getAllOrders();
}
