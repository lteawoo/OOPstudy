package com.taeu.oop.encapsulation01.packageOne;

public class ClassA {
    private int pri;
    int def;
    protected int pro;
    public int pub;

    static private  int priSt;
    static int defSt;
    static protected  int proSt;
    static public int pubSt;

    void runSomething() {
        pri = 5;
        def = 10;
        pro = 20;
        pub = 40;

        //같은 클래스 내에 있으니 사용 가능
        //정적 멤버는 클래스명.정적멤버 형태의 접근을 권장
        ClassA.priSt = 1;
        ClassA.defSt = 1;
        ClassA.proSt = 1;
        ClassA.pubSt = 1;
    }

    static void runStaticThing() {
        //객체를 생성하지 않고는 객체멤버 접근불가
        //pri = 5;
        //def = 10;
        //pro = 20;
        //pub = 40;

        // 정적멤버는 클래스명.정적멤버 형태를 권장
        ClassA.priSt = 1;
        priSt = 1;
        ClassA.defSt = 1;
        defSt = 1;
        ClassA.proSt = 1;
        proSt = 1;
        ClassA.pubSt = 1;
        pubSt = 1;

        //객체 생성 후에는 객체 참조 변수를 통해 접근 가능
        ClassA classA = new ClassA();
        classA.pri = 5;
        classA.def = 5;
        classA.pro = 5;
        classA.pub = 5;

        // 객체 참조 변수를 통해 정적 멤버도 접근 가능하지만 권장하지는 않음
        classA.priSt = 1;
        classA.defSt = 1;
        classA.proSt = 1;
        classA.pubSt = 1;
    }
}
