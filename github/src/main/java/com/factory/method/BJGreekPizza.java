package com.factory.method;

import com.factory.method.Pizza;

public class BJGreekPizza extends Pizza {
    public void prepare() {
        setName("BJGreekPizza");
        System.out.println("prepare BJGreekPizza");
    }
}
