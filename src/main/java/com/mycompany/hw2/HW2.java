/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hw2;
import java.util.Scanner;

/**
 *
 * @author valera
 */
public class HW2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнил Гринченко Валерий, РИБО-01-21, Вариант №1");
        System.out.println("Выбирайте Легковой автомобиль или Грузовой автомобиль");
        System.out.println("0 - Легковой автомобиль, 1 - Грузовой автомобиль: ");
        int i = scan.nextInt();
            if (i==0){
                System.out.println("Введите максимальную скорость: ");
                int maxspeed = scan.nextInt();
                System.out.println("Вместимость (человек): ");
                int vmestimost = scan.nextInt();
                System.out.println("Тип кузова: ");
                String tipkuzova = scan.next();
                System.out.println("Марка: ");
                String marka = scan.next();
                System.out.println("Цвет: ");
                String color = scan.next();
                System.out.println("Стоимость: ");
                int price = scan.nextInt();
                Pass car1 = new Pass(price, color, maxspeed, vmestimost, tipkuzova, marka);
                System.out.println(car1.toString());
            } else{
                System.out.println("Введите максимальную скорость: ");
                int maxspeed = scan.nextInt();
                System.out.println("Вместимость (человек): ");
                int vmestimost = scan.nextInt();
                System.out.println("Тип кузова: ");
                String tipkuzova = scan.next();
                System.out.println("Марка: ");
                String marka = scan.next();
                System.out.println("Цвет: ");
                String color = scan.next();
                System.out.println("Стоимость: ");
                int price = scan.nextInt();
                Truck car2 = new Truck(price, color, maxspeed, vmestimost, tipkuzova, marka);
                System.out.println(car2.toString());
            }
    }
}
