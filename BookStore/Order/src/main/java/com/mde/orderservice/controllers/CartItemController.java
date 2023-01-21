
package com.mde.orderservice.controllers;
import com.mde.orderservice.models.CartItem;
import com.mde.orderservice.services.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@RequestMapping("/api/cartItem") 
@RestController
public class CartItemController{

	private final CartItemService cartItemService;
	@Autowired
	public CartItemController(CartItemService cartItemService) { 
		this.cartItemService = cartItemService;
	}

	@PostMapping
	public CartItem addCartItem(@RequestBody CartItem cartItem){
		 return cartItemService.saveCartItem(cartItem);
	}
	
	@GetMapping
	public List<CartItem> getAllCartItem(){
		 return cartItemService.getAllCartItem();
	
}
	@GetMapping(path = "{id}")
	public Optional<CartItem> getCartItemById(@PathVariable("id") Long id){ 
		return cartItemService.getCartItemById(id);
	}

	@PutMapping
	public CartItem updateCartItem(@RequestBody CartItem cartItem){ 
		return cartItemService.updateCartItem(cartItem);
	}

	@DeleteMapping(path = "{id}")
	public void deleteCartItemById(@PathVariable("id") Long id){ 
		cartItemService.deleteCartItem(id);
	}
}


