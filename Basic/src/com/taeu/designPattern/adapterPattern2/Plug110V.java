package com.taeu.designPattern.adapterPattern2;

public class Plug110V implements Plug{
    @Override
    public String plugIn() {
        return "110V 플러그인!";
    }

    @Override
    public String plugOut() {
        return "110V 플러그 아웃!";
    }
}
