package com.zhoujiang.integrationframework.domain;

public class goodsWithBLOBs extends goods {
    private String gintro;

    private String gmessage;

    public String getGintro() {
        return gintro;
    }

    public void setGintro(String gintro) {
        this.gintro = gintro == null ? null : gintro.trim();
    }

    public String getGmessage() {
        return gmessage;
    }

    public void setGmessage(String gmessage) {
        this.gmessage = gmessage == null ? null : gmessage.trim();
    }
}