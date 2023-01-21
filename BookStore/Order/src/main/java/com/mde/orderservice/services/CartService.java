package com.mde.orderservice.services;
import com.mde.orderservice.models.Cart;
import com.mde.orderservice.repositories.CartRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@Service
public class CartService {

	private CartRepository cartRepo;
	@Autowired
	public CartService(CartRepository cartRepo) { 
		this.cartRepo = cartRepo;
	}

	public Cart saveCart(Cart cart){ 
		return cartRepo.save(cart);
	}
	public List<Cart> getAllCart(){ 
		return cartRepo.findAll();
	}
	public Optional<Cart> getCartById(Long id){ 
		return cartRepo.findById(id);
	}

	public void deleteCart(Long id){ 
		if(id!=null){
			if(getCartById(id).isPresent()) 
				cartRepo.deleteById(id);
		}
	}
	public Cart updateCart(Cart cart){ 
		return cartRepo.save(cart);
	}
	}
