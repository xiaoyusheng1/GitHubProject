package com.factory.simple;

public class Factory {
    public static Pizza getPizza(String pizzaType) {
        if (pizzaType.equals("cheese")) {
            return new CheesePizza();
        } else if (pizzaType.equals("greek")) {
            return new GreekPizza();
        }
        return null;
    }

}
