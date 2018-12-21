package com.Players;

import java.util.List;

public abstract class Player_null <T >{


    public Player_null(int price , T t){
        this.price = price;
        this.setMyzik(t);
    }

    private T myzik ;

    private final int price ;


    public abstract void playSong();




    public int getPrice() {
        return price;
    }


    protected T getMyzik() {
        return myzik;
    }

    protected void setMyzik(T myzik) {
        this.myzik = myzik;
    }
}
