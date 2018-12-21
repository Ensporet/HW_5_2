package com.Players;

public class Player_1 extends Player_null<String> {
    public Player_1(int price, String s) {
        super(price, s);
    }




    public void playSong() {

        if(this.getMyzik() == null){
            System.out.println("Error ! \n Player not have a music ");
        }else {
            System.out.println("Playing: " + this.getMyzik());
        }

    }


}
