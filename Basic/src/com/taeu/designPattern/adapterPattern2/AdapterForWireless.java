package com.taeu.designPattern.adapterPattern2;

public class AdapterForWireless implements Plug{
    private WirelessCharger wc;

    public AdapterForWireless(WirelessCharger wc) {
        this.wc = wc;
    }

    @Override
    public String plugIn() {
        return wc.supplyPowerOn();
    }

    @Override
    public String plugOut() {
        return wc.supplyPowerOff();
    }
}
