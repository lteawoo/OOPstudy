package com.taeu.oop.abstractMethod02;

public class Driver {
    public static void main(String[] args) {
        /*
            아래와 같은 걱정거리를 abstract가 해결한다..(추상클래스와 추상메서드)
            동물 객체는 어떻게 울어야지? / 누가 실수로 동물 객체를 만들면?...
            동물 참조 변수 배열로 모든 동물을 울게 하려면 하위클래스에서 오버라이딩할 울어보세요() 메서드가 동물 클래스에 필요한데..

            추상 클래스는 인스턴스, 즉 객체를 만들수 없다. new를 사용 불가
            추상 메서드는 하위 클래스에게 메서드의 구현을 강제한다. 오버라이딩 강제(안하면 에러)
            추상 메서드를 포함하는 클래스는 반드시 추상클래스여야 한다.
         */
        동물[] 동물들 = new 동물[5];

        동물들[0] = new 쥐();
        동물들[1] = new 고양이();
        동물들[2] = new 강아지();
        동물들[3] = new 송아지();
        동물들[4] = new 병아리();

        for(int i = 0; i < 동물들.length; i++) {
            동물들[i].울어보세요();
        }

        //동물 짐승 = new 동물(); // 동물 is abstract, cannot be instantiated
    }
}
