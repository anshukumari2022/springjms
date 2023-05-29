package com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.controller;

import com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.model.OrderDetail;
import com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.service.OrderAcknowledgementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.NamingException;

@RestController
public class OrderAcknowledgementController {
    @Autowired
    public OrderAcknowledgementService service;

    @PostMapping("/orders")
    public ResponseEntity<String> createOrder(@RequestBody OrderDetail order) {
        service.createOrder(order);
        return new ResponseEntity<>("Order received and acknowledged.", HttpStatus.CREATED);
    }
}





