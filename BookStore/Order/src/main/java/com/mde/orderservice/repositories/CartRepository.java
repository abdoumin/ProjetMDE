package com.mde.orderservice.repositories;


import com.mde.orderservice.models.Cart; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {

}
