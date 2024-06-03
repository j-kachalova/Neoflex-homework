package com.kachalova.proxy;



public class DatabaseProxy implements IDatabase{
    private final DatabaseImpl database;
    private String cache;
    public DatabaseProxy(DatabaseImpl database) {
        this.database = database;
    }
    @Override
    public String connect(String path) {
        if (cache == null) {
            cache = database.connect(path);
        }
        return cache;

    }
}
