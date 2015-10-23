package com.mvii3iv.banks.rest.controllers;


import com.mvii3iv.banks.models.Account;
import com.mvii3iv.banks.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public Iterable<Account> getAccounts(){

        Iterable<Account> data = accountRepository.findAll();
        return data;

    }

}
