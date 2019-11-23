package com.taeu.oop.encapsulation01.packageTwo;

import com.taeu.oop.encapsulation01.packageOne.ClassA;

public class ClassC {
    void runSomething() {
        //상속을 받지 않았기에 ClassA의 객체 멤버는 객체 생성 후에 사용 가능
        //pri = 1;
        //def = 1;
        //pro = 1;
        //pub = 1;

        //private은 같은 클래스
        //default는 같은 패키지
        //protected는 다른 패키지일 경우 상속관계
        //this 키워드는 상속관계가 아니므로 사용할 수 없다.
        //ClassA.priSt = 1;       priSt = 1;      this.priSt = 1;
        //ClassA.defSt = 1;       defSt = 1;      this.defSt = 1;
        //ClassA.proSt = 1;       proSt = 1;      this.proSt = 1;
        ClassA.pubSt = 1;      // pubSt = 1;      //this.pubSt = 1;

        //private : 같은 클래스
        //default : 같은 패키지
        //protected : 다른 패키지인 경우, 상속 관계여야 사용가능
        ClassA classA = new ClassA();
        //classA.pri = 1;
        //classA.def = 1;
        //classA.pro = 1;
        classA.pub = 1;

        //권장하지 않음
        //classA.priSt = 1;
        //classA.defSt = 1;
        //classA.proSt = 1;
        classA.pubSt = 1;
    }

    static void runStaticThing() {
        //객체를 생성하지 않고는 객체 멤버 접근 불가
        //pri = 1;
        //def = 1;
        //pro = 1;
        //pub = 1;

        //private은 같은 클래스
        //default는 같은 패키지
        //protected는 다른 패키지일 경우 상속관계
        //this 키워드는 상속관계가 아니므로 사용할 수도 없고 정적메소드 안애서는 정적멤버,지역변수만 사용가능하다.
        //ClassA.priSt = 1;       priSt = 1;      this.priSt = 1;
        //ClassA.defSt = 1;       defSt = 1;      this.defSt = 1;
        //ClassA.proSt = 1;       proSt = 1;      this.proSt = 1;
        ClassA.pubSt = 1;      // pubSt = 1;      //this.pubSt = 1;

        //private : 같은 클래스
        //default : 같은 패키지
        //protected : 다른 패키지인 경우, 상속 관계여야 사용가능
        ClassA classA = new ClassA();
        //classA.pri = 1;
        //classA.def = 1;
        //classA.pro = 1;
        classA.pub = 1;

        //권장하지 않음
        //classA.priSt = 1;
        //classA.defSt = 1;
        //classA.proSt = 1;
        classA.pubSt = 1;
    }
}
