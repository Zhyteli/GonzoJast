package com.element196.utils.element;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

@Entity(indexes = {
        @Index(value = "gon, dor, gordon")
})
public class GonDo {
    @Id
    private String gon;
    private String dor;
    private String gordon;

    @Generated(hash = 2048870506)
    public GonDo(String gon, String dor, String gordon) {
        this.gon = gon;
        this.dor = dor;
        this.gordon = gordon;
    }

    @Generated(hash = 1078211591)
    public GonDo() {
    }

    public String getGon() {
        return gon;
    }

    public void setGon(String gon) {
        this.gon = gon;
    }

    public String getDor() {
        return dor;
    }

    public void setDor(String dor) {
        this.dor = dor;
    }

    public String getGordon() {
        return gordon;
    }

    public void setGordon(String gordon) {
        this.gordon = gordon;
    }

    @Override
    public String toString() {
        return "GonDo{" +
                "gon='" + gon + '\'' +
                ", dor='" + dor + '\'' +
                ", gordon='" + gordon + '\'' +
                '}';
    }
}
