package com.taeu.oop.This;

class 펭귄 {
    int var = 10;

    void test() {
        int var = 20;


        //지역변수와 속성(객체 변수, 정적 변수)의 이름이 같은 경우 지역 변수가 우선한다.
        //객체 변수와 이름이 같은 지역 변수가 있는 경우 객체 변수를 사용하려면 this를 접두사로 사용해야한다.
        //정적 변수와 이름이 같은 지역 변수가 있는 경우 정적 변수를 사용하려면 클래스명을 접두사로 사용해야한다.
        System.out.println(var);
        System.out.println(this.var);
    }
}

public class Driver {
    public static void main(String[] args) {
        펭귄 뽀로로 = new 펭귄();
        뽀로로.test();
    }
}
