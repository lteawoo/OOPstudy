package com.taeu.oop.encapsulation01.packageTwo;

import com.taeu.oop.encapsulation01.packageOne.ClassA;

public class ClassAB extends ClassA {
    void runSomething() {
        //private : 같은 클래스내에서만 가능
        //default : 같은 패키지
        //pri = 1;
        //def = 1;
        pro = 1;
        pub = 1;

        //ClassA.priSt = 1;       priSt = 1;      this.priSt = 1;
        //ClassA.defSt = 1;       defSt = 1;      this.defSt = 1;
        ClassA.proSt = 1;       proSt = 1;      this.proSt = 1;
        ClassA.pubSt = 1;       pubSt = 1;      this.pubSt = 1;

        // 객체 멤버를 객체 생성 후에 객체 참조 변수를 통해 접근 가능
        // 하지만 private는 같은 클래스, default는 같은 패키지
        ClassAB classAB = new ClassAB();
        //classAB.pri = 1;
        //classAB.def = 1;
        classAB.pro = 1;
        classAB.pub = 1;
    }

    static void runStaticSomething() {
        //객체를 생성하지 않고는 객체멤버 접근불가
        //pri = 1;
        //def = 1;
        //pro = 1;
        //pub = 1;

        //ClassA.priSt = 1;
        //ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;

        // 객체 멤버를 객체 생성 후에 객체 참조 변수를 통해 접근 가능
        // 하지만 private는 같은 클래스, default는 같은 패키지
        ClassAB classAB = new ClassAB();
        //classAB.pri = 1;
        //classAB.def = 1;
        classAB.pro = 1;
        classAB.pub = 1;

        //권장하지 않음
        //classAB.priSt = 1;
        //classAB.defSt = 1;
        classAB.proSt = 1;
        classAB.pubSt = 1;
    }
}
