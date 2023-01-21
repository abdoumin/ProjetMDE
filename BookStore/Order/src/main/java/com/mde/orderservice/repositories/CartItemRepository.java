package com.mde.orderservice.repositories;


import com.mde.orderservice.models.CartItem; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Long> {

}
