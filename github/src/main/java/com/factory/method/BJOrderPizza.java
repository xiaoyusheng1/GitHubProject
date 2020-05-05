package com.factory.method;

import com.factory.method.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
