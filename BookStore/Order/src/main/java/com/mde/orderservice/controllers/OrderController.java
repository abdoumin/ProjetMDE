
package com.mde.orderservice.controllers;
import com.mde.orderservice.models.Order;
import com.mde.orderservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@RequestMapping("/api/order") 
@RestController
public class OrderController{

	private final OrderService orderService;
	@Autowired
	public OrderController(OrderService orderService) { 
		this.orderService = orderService;
	}

	@PostMapping
	public Order addOrder(@RequestBody Order order){
		 return orderService.saveOrder(order);
	}
	
	@GetMapping
	public List<Order> getAllOrder(){
		 return orderService.getAllOrder();
	
}
	@GetMapping(path = "{id}")
	public Optional<Order> getOrderById(@PathVariable("id") Long id){ 
		return orderService.getOrderById(id);
	}

	@PutMapping
	public Order updateOrder(@RequestBody Order order){ 
		return orderService.updateOrder(order);
	}

	@DeleteMapping(path = "{id}")
	public void deleteOrderById(@PathVariable("id") Long id){ 
		orderService.deleteOrder(id);
	}
}


