package com.factory.method;

import com.factory.method.Pizza;

public class LDGreekPizza extends Pizza {
    public void prepare() {
        setName("LDGreekPizza");
        System.out.println("prepare LDGreekPizza");
    }
}
