package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("First change");
        System.out.println(add(3,3));
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static void greetings() {
        System.out.println("He" + add(1,0) + add(1,0) + "o");
    }
}
