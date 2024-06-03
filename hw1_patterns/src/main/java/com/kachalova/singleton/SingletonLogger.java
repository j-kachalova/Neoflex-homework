package com.kachalova.singleton;

import java.time.LocalDate;

public class SingletonLogger {
    private static SingletonLogger singletonLogger;
    private SingletonLogger(){}
    public static SingletonLogger getInstance(){
        if(singletonLogger==null) singletonLogger = new SingletonLogger();
        return singletonLogger;
    }
    public void classLogg(Object obj, String info){
        System.out.println("Log info: "+ LocalDate.now()+" - " + obj.getClass()+" - "+info);
    }
}
