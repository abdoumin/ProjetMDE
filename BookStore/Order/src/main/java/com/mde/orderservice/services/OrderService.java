package com.mde.orderservice.services;
import com.mde.orderservice.models.Order;
import com.mde.orderservice.repositories.OrderRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@Service
public class OrderService {

	private OrderRepository orderRepo;
	@Autowired
	public OrderService(OrderRepository orderRepo) { 
		this.orderRepo = orderRepo;
	}

	public Order saveOrder(Order order){ 
		return orderRepo.save(order);
	}
	public List<Order> getAllOrder(){ 
		return orderRepo.findAll();
	}
	public Optional<Order> getOrderById(Long id){ 
		return orderRepo.findById(id);
	}

	public void deleteOrder(Long id){ 
		if(id!=null){
			if(getOrderById(id).isPresent()) 
				orderRepo.deleteById(id);
		}
	}
	public Order updateOrder(Order order){ 
		return orderRepo.save(order);
	}
	}
