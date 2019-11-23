package com.taeu.oop.stack;

class 펭귄 {
    void test() {
        System.out.println("Test");
    }
}

public class Driver {
    public static void main(String[] args) {
        펭귄 뽀로로 = new 펭귄();

        뽀로로.test();
        //스택프레임 정보가 뽀로로.test()가 아닌 펭귄.test() 다?

    }
}