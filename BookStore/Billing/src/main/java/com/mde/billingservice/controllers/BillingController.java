
package com.mde.billingservice.controllers;
import com.mde.billingservice.models.Billing;
import com.mde.billingservice.services.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@RequestMapping("/api/billing") 
@RestController
public class BillingController{

	private final BillingService billingService;
	@Autowired
	public BillingController(BillingService billingService) { 
		this.billingService = billingService;
	}

	@PostMapping
	public Billing addBilling(@RequestBody Billing billing){
		 return billingService.saveBilling(billing);
	}
	
	@GetMapping
	public List<Billing> getAllBilling(){
		 return billingService.getAllBilling();
	
}
	@GetMapping(path = "{id}")
	public Optional<Billing> getBillingById(@PathVariable("id") Long id){ 
		return billingService.getBillingById(id);
	}

	@PutMapping
	public Billing updateBilling(@RequestBody Billing billing){ 
		return billingService.updateBilling(billing);
	}

	@DeleteMapping(path = "{id}")
	public void deleteBillingById(@PathVariable("id") Long id){ 
		billingService.deleteBilling(id);
	}
}


