package com.taeu.oop.constructor03;

import com.taeu.oop.constructor03.동물;

public class Driver {
    public static void main(String[] args) {
        동물 뽀로로 = new 동물("뽀로로");
        //아무런 생성자를 만들지 않으면 인자가 없는 기본 생성자는 자동으로 생성된다.
        //인자가 있는 생성자를 하나라도 만든다면 자바는 기본 생성자를 만들어 주지 않는다.
        //동물 무명 = new 동물();
    }
}
