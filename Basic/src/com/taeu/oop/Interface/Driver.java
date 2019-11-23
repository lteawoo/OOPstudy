package com.taeu.oop.Interface;

interface Speakable {
    public double PI = 3.14159; // public static final double PI = 3.14159;
    final double absoluteZeroPoint = -275.15;

    void sayYes();  // public abstract void sayYes();
}

class Speaker implements Speakable {
    @Override
    public void sayYes() {
        System.out.println("I say NO!!");
    }
}

public class Driver {
    public static void main(String[] args) {
        System.out.println(Speakable.absoluteZeroPoint);
        System.out.println(Speakable.PI);

        //interface의 변수가 정적 상수인 증거
        //1.값을 할당할수없음
        //Speakable.PI = 3.14;
        //값을 할당 할 수 없다 -> final 변수(상수)
        //2.클래스명으로 접근가능한 속성은 정적 속성이다.
        //결과적으로 final static 멤버다.

        Speaker reporter1 = new Speaker();

        reporter1.sayYes();
    }
}
