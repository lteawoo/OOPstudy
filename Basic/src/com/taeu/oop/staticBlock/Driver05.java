package com.taeu.oop.staticBlock;

public class Driver05 {
    public static void main(String[] args) {
        System.out.println("main 메서드 시작!");
        Animal choco = new Animal();
        System.out.println(choco.age);
    }
}

class Animal {
    static int age = 0;

    {
        System.out.println("Class Instance block");
    }

    static {
        System.out.println("Animal class ready on!");
    }
}
