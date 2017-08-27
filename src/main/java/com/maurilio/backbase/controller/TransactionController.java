/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maurilio.backbase.controller;

import java.util.List;
import java.util.stream.Collectors;
import com.maurilio.backbase.model.Transaction;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    ClientRestController client;

    public TransactionController(){
        client = new ClientRestController();
    }
    
    public TransactionController(ClientRestController client){
        this.client = client;
    }
    
    @RequestMapping(produces = "application/json")
    public List<Transaction> transactions() {
        return client.getAccountTransactions();
    }

    @RequestMapping(value = "/{type}", produces = "application/json")
    public List<Transaction> transactions(@PathVariable String type) {
        return client.getAccountTransactions().stream().filter(t -> 
                t.getTransactionType().equals(type)
        ).collect(Collectors.toList());
    }

    @RequestMapping(value = "/{type}/total", produces = "application/json")
    public String transactionsSum(@PathVariable String type) {
        double result = client.getAccountTransactions().stream().filter(t -> 
                t.getTransactionType().equals(type)
        ).mapToDouble(t -> t.getTransactionAmount()).sum();
        JSONObject json = new JSONObject();
        json.put("total", result);
        return json.toString();
    }
}
