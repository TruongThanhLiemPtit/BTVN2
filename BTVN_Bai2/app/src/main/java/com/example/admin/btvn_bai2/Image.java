package com.example.admin.btvn_bai2;

/**
 * Created by Admin on 31/3/2018.
 */

public class Image {
    private int IDimage;
    private boolean choose;

    public Image(int IDimage, boolean choose) {
        this.IDimage = IDimage;
        this.choose = choose;
    }

    public int getIDimage() {
        return IDimage;
    }

    public void setIDimage(int IDimage) {
        this.IDimage = IDimage;
    }

    public boolean isChoose() {
        return choose;
    }

    public void setChoose(boolean choose) {
        this.choose = choose;
    }
}
