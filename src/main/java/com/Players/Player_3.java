package com.Players;

import java.util.ArrayList;

public  class Player_3 extends Player_null<ArrayList<String>> {




    public Player_3(int price, ArrayList<String> strings) {
        super(price, strings);
    }


    public void playAllSongs(){

        if(this.getMyzik() == null || this.getMyzik().size() == 0){System.out.println("Error playList is empty ");return;}

        for(String s : this.getMyzik()){
            playSong(s);
        }

    }

    public void playSong() {

        if(this.getMyzik() == null || this.getMyzik().size() == 0){System.out.println("Error playList is empty ");}
        else { System.out.println("Playing: " + this.getMyzik().get(0));}


    }

    protected void playSong(String s){

        if(this.getMyzik() == null || this.getMyzik().size() == 0){System.out.println("Error playList is empty ");}
        else {
            if(s == null){System.out.println("Plaing: null");}else {System.out.println("Plaing: " + s);}

        }

    }



}