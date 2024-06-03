package com.kachalova.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        IUsb usb = new FlashDrive();
        computer.connect(usb);
        MemoryCardImpl memoryCard = new MemoryCardImpl();
        MemoryCardAdapter adapter = new MemoryCardAdapter(memoryCard);
        computer.connect(adapter);
    }
}
