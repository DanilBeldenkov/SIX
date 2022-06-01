package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");

        int num1 = in.nextInt();
        System.out.println("Таблица умножения для "+num1+":");
        for (int i=1; i< 10; i++){
            System.out.println(num1 + " x " + (i) + " = " +
                    (num1 * (i)));
        }
    }
}