package com.test;

public class Delivery {

    private int packSize;

    public Delivery(int packSize){
        this.packSize = packSize;
    }

    public void infoTransort(){
        if (packSize > 10) {
            System.out.println("This is big pack");
        }else {
            System.out.println("This is small pack");
        }

    }

}
