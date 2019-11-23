package com.taeu.designPattern.singletonPattern;

public class Singleton {
    static Singleton singletonObject; //정적 참조 변수

    private Singleton() { }; // private 생성자

    public static Singleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }

        return singletonObject;
    }
}
