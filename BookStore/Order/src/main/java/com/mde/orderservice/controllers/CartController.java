
package com.mde.orderservice.controllers;
import com.mde.orderservice.models.Cart;
import com.mde.orderservice.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@RequestMapping("/api/cart") 
@RestController
public class CartController{

	private final CartService cartService;
	@Autowired
	public CartController(CartService cartService) { 
		this.cartService = cartService;
	}

	@PostMapping
	public Cart addCart(@RequestBody Cart cart){
		 return cartService.saveCart(cart);
	}
	
	@GetMapping
	public List<Cart> getAllCart(){
		 return cartService.getAllCart();
	
}
	@GetMapping(path = "{id}")
	public Optional<Cart> getCartById(@PathVariable("id") Long id){ 
		return cartService.getCartById(id);
	}

	@PutMapping
	public Cart updateCart(@RequestBody Cart cart){ 
		return cartService.updateCart(cart);
	}

	@DeleteMapping(path = "{id}")
	public void deleteCartById(@PathVariable("id") Long id){ 
		cartService.deleteCart(id);
	}
}


