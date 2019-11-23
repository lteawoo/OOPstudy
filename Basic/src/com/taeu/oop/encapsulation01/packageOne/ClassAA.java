package com.taeu.oop.encapsulation01.packageOne;

public class ClassAA extends ClassA {
    void runSomething() {
        //private : 같은 클래스 내에서만 가능
        //pri = 1;
        def = 1;
        pro = 1;
        pub = 1;

        //정적멤버는 클래스명.정적멤버 형식의 접근을 권장
        //정적멤버(static)는 static 영역에 위치해있기 때문에 아래의 사용방법들은 메모리주소를 공유한다
        //ClassA.priSt = 1;       priSt = 1;      this.priSt = 1;
        ClassA.defSt = 1;
        defSt = 1;
        this.defSt = 1;
        ClassA.proSt = 1;       proSt = 1;      this.proSt = 1;
        ClassA.pubSt = 1;       pubSt = 1;      this.pubSt = 1;
    }

    static void runStaticThing() {
        //객체멤버 접근 불가 객체 참조 변수 생성 필요
        //pri = 1;
        //def = 1;
        //pro = 1;
        //pub = 1;

        //정적멤버는 클래스명.정적멤버 형식의 접근을 권장
        //정적메서드내에서 this는 사용 불가능하다(정적메서드내에서는 정적,지역변수만 사용가능)
        //ClassA.priSt = 1;       priSt = 1;    //this.priSt = 1;
        ClassA.defSt = 1;       defSt = 1;      //this.defSt = 1;
        ClassA.proSt = 1;       proSt = 1;      //this.proSt = 1;
        ClassA.pubSt = 1;       pubSt = 1;      //this.pubSt = 1;

        //private : 같은 클래스 내에서만 가능
        ClassAA caa = new ClassAA();
        //caa.pri = 1;
        caa.def = 1;
        caa.pro = 1;
        caa.pub = 1;

        //권장하지 않음
        //caa.priSt = 1;
        caa.defSt = 1;
        caa.proSt = 1;
        caa.pubSt = 1;
    }
}
