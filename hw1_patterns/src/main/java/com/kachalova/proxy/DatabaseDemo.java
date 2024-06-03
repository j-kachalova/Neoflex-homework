package com.kachalova.proxy;

public class DatabaseDemo {
    public static void main(String[] args) {
        DatabaseImpl database = new DatabaseImpl("postgresql");
        DatabaseProxy proxy = new DatabaseProxy(database);
        System.out.println(proxy.connect("localhost:5432/"));
        System.out.println(proxy.connect("localhost:5432/"));
    }
}
