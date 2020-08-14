package com.len.demo.designpatterns.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("color")) {
            return new CarFactory();
        } else if (choice.equalsIgnoreCase("car")) {
            return new CarFactory();
        }
        return null;
    }
}
