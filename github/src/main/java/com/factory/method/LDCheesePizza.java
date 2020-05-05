package com.factory.method;

import com.factory.method.Pizza;

public class LDCheesePizza extends Pizza {
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("prepare LDCheesePizza");
    }
}
