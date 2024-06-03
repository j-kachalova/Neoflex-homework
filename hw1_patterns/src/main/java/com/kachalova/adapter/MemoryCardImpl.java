package com.kachalova.adapter;

public class MemoryCardImpl implements IMemoryCard {
    @Override
    public void getData() {
        System.out.println("Data from memory card");
    }
}
