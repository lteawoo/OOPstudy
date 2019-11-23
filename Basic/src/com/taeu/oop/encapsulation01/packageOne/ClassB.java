package com.taeu.oop.encapsulation01.packageOne;

public class ClassB {
    void runSomething() {
        // ClassA의 객체멤버는 객체 생성 후 접근 가능(상속 관계가 아니기 때문에)
        //pri = 1;
        //def = 1;
        //pro = 1;
        //pub = 1;

        //정적멤버는 클래스명.정적멤버 형태의 접근을 권장
        //private는 같은 클래스에서만 사용가능
        //ClassA.priSt = 1;
        ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;

        //private은 같은 패키지, 같은 클래스에서만 사용가능
        ClassA classA = new ClassA();
        //classA.pri = 1;
        classA.def = 1;
        classA.pro = 1;
        classA.pub = 1;

        //정적멤버변수도 객체참조변수로 접근가능 하지만 권장하지 않음
        //classA.priSt = 1;
        classA.defSt = 1;
        classA.proSt = 1;
        classA.pubSt = 1;
    }

    static void runStaticThing() {
        //객체 생성하지 않고는 접근불가
        //pri = 1;
        //def = 1;
        //pro = 1;
        //pub = 1;

        //정적멤버는 클래스명.정적멤버 형태의 접근을 권장
        //private는 같은 클래스에서만 사용가능
        //ClassA.priSt = 1;
        ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;

        //private은 같은 패키지, 같은 클래스에서만 사용가능
        ClassA classA = new ClassA();
        //classA.pri = 1;
        classA.def = 1;
        classA.pro = 1;
        classA.pub = 1;
    }
}
