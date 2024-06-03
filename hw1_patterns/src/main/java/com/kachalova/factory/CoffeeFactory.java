package com.kachalova.factory;

public class CoffeeFactory {
    public static Coffee getCoffee(CoffeeType coffeeType){
        Coffee coffee;
        switch (coffeeType) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default:
                throw new IllegalArgumentException("Invalid coffee type");
        }
        return coffee;
    }
}
