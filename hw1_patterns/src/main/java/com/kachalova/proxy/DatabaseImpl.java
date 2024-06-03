package com.kachalova.proxy;

public class DatabaseImpl implements IDatabase{
    private String databaseName;
    public DatabaseImpl(String databaseName) {
        this.databaseName = databaseName;
    }
    public String getDatabaseName() {
        return databaseName;
    }
    @Override
    public String connect(String path){
        return  "подключено " +path + databaseName;
    }
}
