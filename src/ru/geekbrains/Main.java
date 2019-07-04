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
        System.out.println("Приветствую тебя в мире программирования, "+ n);
        String str = "Мне нравится работать на Java";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка в обычном порядке: " + str);
        System.out.println("Строка в обратном порядке: " + reverse);
    }
}
