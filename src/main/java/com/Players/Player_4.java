package com.Players;

import java.util.ArrayList;

public class Player_4 extends Player_3 {
    public Player_4(int price, ArrayList<String> strings) {
        super(price, strings);
    }


    public void playSong() {

        if(this.getMyzik() == null || this.getMyzik().size() == 0){System.out.println("Error playList is empty ");return;}

        this.playSong(this.getMyzik().get((this.getMyzik().size() - 1)));


    }
}
