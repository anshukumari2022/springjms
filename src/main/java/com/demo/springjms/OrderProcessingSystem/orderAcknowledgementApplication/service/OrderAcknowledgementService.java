package com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.service;

import com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.model.OrderDetail;
import com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAcknowledgementService {

    @Autowired
    public MessageSender sender;
    public void createOrder(OrderDetail order) {
        sender.sendOrder(order);
    }
}
