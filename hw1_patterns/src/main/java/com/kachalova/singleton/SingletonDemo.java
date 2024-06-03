package com.kachalova.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        TestClass testClass = new TestClass();
        singletonLogger.classLogg(testClass,"this is test class");
    }
}
