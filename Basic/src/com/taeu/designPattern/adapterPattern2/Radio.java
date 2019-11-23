package com.taeu.designPattern.adapterPattern2;

public class Radio {
    private Plug plug;

    public Radio(Plug plug) {
        this.plug = plug;
    }

    public void powerOn() {
       System.out.println(plug.plugIn());
    }
}
