package com.Players;

import java.util.ArrayList;

public class Player_5  extends Player_3{
    public Player_5(int price, ArrayList<String> strings) {
        super(price, strings);
    }


    @Override
    public void playAllSongs() {


        if(this.getMyzik() == null || this.getMyzik().size() == 0){System.out.println("Error playList is empty ");return;}

        for(int i = (this.getMyzik().size() - 1) ; i > -1 ; i--){
            playSong(this.getMyzik().get(i));
        }


    }
}
