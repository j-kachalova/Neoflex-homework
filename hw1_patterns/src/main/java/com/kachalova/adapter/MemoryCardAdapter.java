package com.kachalova.adapter;

public class MemoryCardAdapter implements IUsb{
    private final MemoryCardImpl memoryCardDevice;
    public MemoryCardAdapter(MemoryCardImpl memoryCard) {
        this.memoryCardDevice = memoryCard;
    }

    @Override
    public void getData() {
        memoryCardDevice.getData();
    }
}
