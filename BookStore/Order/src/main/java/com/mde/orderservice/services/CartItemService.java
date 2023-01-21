package com.mde.orderservice.services;
import com.mde.orderservice.models.CartItem;
import com.mde.orderservice.repositories.CartItemRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@Service
public class CartItemService {

	private CartItemRepository cartItemRepo;
	@Autowired
	public CartItemService(CartItemRepository cartItemRepo) { 
		this.cartItemRepo = cartItemRepo;
	}

	public CartItem saveCartItem(CartItem cartItem){ 
		return cartItemRepo.save(cartItem);
	}
	public List<CartItem> getAllCartItem(){ 
		return cartItemRepo.findAll();
	}
	public Optional<CartItem> getCartItemById(Long id){ 
		return cartItemRepo.findById(id);
	}

	public void deleteCartItem(Long id){ 
		if(id!=null){
			if(getCartItemById(id).isPresent()) 
				cartItemRepo.deleteById(id);
		}
	}
	public CartItem updateCartItem(CartItem cartItem){ 
		return cartItemRepo.save(cartItem);
	}
	}
