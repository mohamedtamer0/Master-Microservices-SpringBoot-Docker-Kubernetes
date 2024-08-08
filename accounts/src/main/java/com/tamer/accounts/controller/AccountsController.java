package com.tamer.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping("SayHello")
    public String sayHello(){
        return "Hello World";
    }
}
