package org.karsun;

import org.springframework.stereotype.Component;

@Component
public class CalculationService {

    public Order calculateTotal(Order order) {
        order.setTotal(order.getTotal() + (order.getTotal() * 0.053));
        return order;
    }
    
}
