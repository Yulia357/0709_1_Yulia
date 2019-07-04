package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        Scanner scannerB = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b="+ (a / b));
        System.out.println("a+b="+ (a + b));
        System.out.println("a-b="+ (a - b));
        StringBuffer buffer = new StringBuffer("Я буду Java-программистом!");
        buffer.reverse();
        System.out.println(buffer);
        System.out.println("Введите Ваше Имя");
        Scanner scannerN = new Scanner(System.in);
        String n = scanner.next();
        System.out.print("Приветствую тебя в мире программирования, "+ n);
    }
}
