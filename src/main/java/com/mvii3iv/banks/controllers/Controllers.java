package com.mvii3iv.banks.controllers;

import com.mvii3iv.banks.models.Account;
import com.mvii3iv.banks.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@Controller
public class Controllers {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showIndex(){ return "index"; }




}
