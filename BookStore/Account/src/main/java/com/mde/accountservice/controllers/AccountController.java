
package com.mde.accountservice.controllers;
import com.mde.accountservice.models.Account;
import com.mde.accountservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@RequestMapping("/api/account") 
@RestController
public class AccountController{

	private final AccountService accountService;
	@Autowired
	public AccountController(AccountService accountService) { 
		this.accountService = accountService;
	}

	@PostMapping
	public Account addAccount(@RequestBody Account account){
		 return accountService.saveAccount(account);
	}
	
	@GetMapping
	public List<Account> getAllAccount(){
		 return accountService.getAllAccount();
	
}
	@GetMapping(path = "{id}")
	public Optional<Account> getAccountById(@PathVariable("id") Long id){ 
		return accountService.getAccountById(id);
	}

	@PutMapping
	public Account updateAccount(@RequestBody Account account){ 
		return accountService.updateAccount(account);
	}

	@DeleteMapping(path = "{id}")
	public void deleteAccountById(@PathVariable("id") Long id){ 
		accountService.deleteAccount(id);
	}
}


