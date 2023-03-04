package com.mycompany.hw2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valera
 */
public class Car {
    private int maxspeed;
    private int vmestimost;
    private String tipkuzova;
    private String marka;

    public Car(int maxspeed, int vmestimost, String tipkuzova, String marka) {
        this.maxspeed = maxspeed;
        this.vmestimost = vmestimost;
        this.tipkuzova = tipkuzova;
        this.marka = marka;
    }

    public int getmaxspeed() {
        return maxspeed;
    }

    public int getvmestimost() {
        return vmestimost;
    }

    public String gettipkuzova() {
        return tipkuzova;
    }

    public String getmarka() {
        return marka;
    }
}
