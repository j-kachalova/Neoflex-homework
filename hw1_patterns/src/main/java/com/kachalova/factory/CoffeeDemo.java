package com.kachalova.factory;

import static com.kachalova.factory.CoffeeType.AMERICANO;
import static com.kachalova.factory.CoffeeType.ESPRESSO;

public class CoffeeDemo {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee(AMERICANO);
        coffeeMachine.makeCoffee(ESPRESSO);
    }
}