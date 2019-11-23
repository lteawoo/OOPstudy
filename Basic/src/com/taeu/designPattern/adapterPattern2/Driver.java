package com.taeu.designPattern.adapterPattern2;

public class Driver {
    public static void main(String[] args) {
        Radio radio = new Radio(new Plug110V());

        radio.powerOn();

        //무선으로 라디오 사용하고싶어!
        //대신 나는 변경이 적어야해!
        //라디오의 소스코드를 안고쳐도 되야해!
        radio = new Radio(new AdapterForWireless(new WirelessCharger()));

        radio.powerOn();
    }
}
