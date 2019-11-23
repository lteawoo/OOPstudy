package com.taeu.designPattern.factoryMethodPattern;

public class Dog extends Animal{
    // 추상 팩터리 메서드
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
