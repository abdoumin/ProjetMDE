package com.mde.accountservice.services;
import com.mde.accountservice.models.Account;
import com.mde.accountservice.repositories.AccountRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@Service
public class AccountService {

	private AccountRepository accountRepo;
	@Autowired
	public AccountService(AccountRepository accountRepo) { 
		this.accountRepo = accountRepo;
	}

	public Account saveAccount(Account account){ 
		return accountRepo.save(account);
	}
	public List<Account> getAllAccount(){ 
		return accountRepo.findAll();
	}
	public Optional<Account> getAccountById(Long id){ 
		return accountRepo.findById(id);
	}

	public void deleteAccount(Long id){ 
		if(id!=null){
			if(getAccountById(id).isPresent()) 
				accountRepo.deleteById(id);
		}
	}
	public Account updateAccount(Account account){ 
		return accountRepo.save(account);
	}
	}
