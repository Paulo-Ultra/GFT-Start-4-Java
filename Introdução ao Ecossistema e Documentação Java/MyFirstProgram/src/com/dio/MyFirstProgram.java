package com.dio;

import com.dio.base.Order;
import com.dio.base.javadoc.OrderDocumented;

public class MyFirstProgram {
    public static void main(String[] args) {

        Order order = new Order("1234", 99);
        System.out.println(order);


    }
}
