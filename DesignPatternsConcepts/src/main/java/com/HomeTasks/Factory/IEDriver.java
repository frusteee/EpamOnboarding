package com.HomeTasks.Factory;

public class IEDriver implements Driver{
    @Override
    public void initializeDriver() {
        System.out.println("Initialized IE Driver");
    }
}
