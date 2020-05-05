package com.factory.method;

import com.factory.method.Pizza;

public class BJCheesePizza extends Pizza {

    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("prepare BJCheesePizza");
    }
}
