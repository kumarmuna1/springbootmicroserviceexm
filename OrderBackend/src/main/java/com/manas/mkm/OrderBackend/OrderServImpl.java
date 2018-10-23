package com.manas.mkm.OrderBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/order/service")
public class OrderServImpl {

	@GetMapping
	public String hello(){
		return "hello...";
	}
}
