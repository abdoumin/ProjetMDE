package com.mde.billingservice.services;
import com.mde.billingservice.models.Billing;
import com.mde.billingservice.repositories.BillingRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@Service
public class BillingService {

	private BillingRepository billingRepo;
	@Autowired
	public BillingService(BillingRepository billingRepo) { 
		this.billingRepo = billingRepo;
	}

	public Billing saveBilling(Billing billing){ 
		return billingRepo.save(billing);
	}
	public List<Billing> getAllBilling(){ 
		return billingRepo.findAll();
	}
	public Optional<Billing> getBillingById(Long id){ 
		return billingRepo.findById(id);
	}

	public void deleteBilling(Long id){ 
		if(id!=null){
			if(getBillingById(id).isPresent()) 
				billingRepo.deleteById(id);
		}
	}
	public Billing updateBilling(Billing billing){ 
		return billingRepo.save(billing);
	}
	}
