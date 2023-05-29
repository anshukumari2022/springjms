package com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.sender;

import com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Value("$(springjms.requestQueue)")
    private String queue;
    public void sendOrder(OrderDetail order) {
        jmsTemplate.convertAndSend(queue, order);

    }
}
