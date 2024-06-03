package com.kachalova.adapter;

public class Computer {
    public void connect(IUsb usb){
        System.out.println("device is connected");
        usb.getData();
    }
}
