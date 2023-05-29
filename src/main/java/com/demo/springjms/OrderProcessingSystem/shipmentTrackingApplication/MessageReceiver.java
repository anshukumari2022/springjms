package com.demo.springjms.OrderProcessingSystem.shipmentTrackingApplication;

import com.demo.springjms.OrderProcessingSystem.orderAcknowledgementApplication.model.OrderDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    private static final Logger logger = LoggerFactory.getLogger(MessageReceiver.class);

    @JmsListener(destination= "$(springjms.requestQueue)")
    public void receive(OrderDetail order){
        logger.info("Order received : "+order);
    }
}
