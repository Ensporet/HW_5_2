import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> playList = new ArrayList<String>();

        Collections.addAll(playList, "Friday I am love", "The Cranberries -Zombie ", "A Thousand Years");
        int price = 0;

        //------------------01-------------------------------------------------------------------
        System.out.println("HW_5_2 \nPlayer01");
        {
          System.out.println("Playing \"Playing()\"");
          new  com.Players.Player_1(price,playList.get(0)).playSong();

        }
        System.out.println("|-------------------------------------------------------------------------| \n");
        //------------------02-------------------------------------------------------------------
        System.out.println("Player02");
        {   System.out.println("Playing \"Playing()\"");
            new  com.Players.Player_2(price,playList.get(0)).playSong();
        }
        System.out.println("|-------------------------------------------------------------------------| \n");
        //------------------03-------------------------------------------------------------------
        System.out.println("Player03");
        {
            com.Players.Player_3 pl = new com.Players.Player_3(price,playList);
            System.out.println("Playing \"Playing()\"");
                pl.playSong();
            System.out.println("\nPlaying All");
                pl.playAllSongs();
        }
        System.out.println("|-------------------------------------------------------------------------| \n");
        //------------------04-------------------------------------------------------------------
        System.out.println("Player04");
        {
            com.Players.Player_4 pl = new com.Players.Player_4(price,playList);
            System.out.println("Playing \"Playing()\"");
            pl.playSong();
            System.out.println("\nPlaying All");
            pl.playAllSongs();
        }
        System.out.println("|-------------------------------------------------------------------------| \n");
        //------------------05-------------------------------------------------------------------
        System.out.println("Player05");
        {
            com.Players.Player_5 pl = new com.Players.Player_5(price,playList);
            System.out.println("Playing \"Playing()\"");
            pl.playSong();
            System.out.println("\nPlaying All");
            pl.playAllSongs();
        }
        System.out.println("|-------------------------------------------------------------------------| \n");
        //------------------06-------------------------------------------------------------------
        System.out.println("Player06");
        {
            com.Players.Player_6 pl = new com.Players.Player_6(price,playList);
            System.out.println("Playing \"Playing()\"");
            pl.playSong();
            System.out.println("\nPlaying All");
            pl.playAllSongs();
            System.out.println("\nPlaying sort");
            pl.shuffle();
            pl.playAllSongs();
        }
        System.out.println("|-------------------------------------------------------------------------| \n");
        //------------------------end---------------------------------------------

    }

}
