/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw2;

/**
 *
 * @author valera
 */
public class Pass extends Car {
    private int price;
    private String color;

    public Pass(int price, String color, int maxspeed, int vmestimost, String tipkuzova, String marka) {
        super(maxspeed, vmestimost, tipkuzova, marka);
        this.price = price;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Легковой автомобиль {" + "максимальная скорость = " + getmaxspeed() + ", вместимость (человек) = " + getvmestimost() + ", тип кузова = " + gettipkuzova() + ", марка = " + getmarka() + ", цена = " + price + ", цвет = " + color + '}';
    }
}
