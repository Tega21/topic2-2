package com.gcu.topic31;

import com.gcu.topic31.business.OrdersBusinessService;
import com.gcu.topic31.business.OrdersBusinessServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name="ordersBusinessService")
    public OrdersBusinessServiceInterface getOrdersBusiness(){
        return new OrdersBusinessService();
    }

}
