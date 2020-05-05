package com.factory.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {

        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = Factory.getPizza(orderType);
            pizza.setName(orderType);
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("greek");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("cheese");
//            } else {
//                break;
//            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    public String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            return "";
        }
    }
}
