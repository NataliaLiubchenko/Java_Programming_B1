package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingSong {
    public static void main(String[] args) {
        Song song1 =new Song("Waka waka", 3.2);
        Song song2 =new Song("Yesterday", 3.1, "Beatles");
        Song song3 =new Song("Here without you", 3.0, "Ruslan","rock");

        ArrayList <Song> songList = new ArrayList<>();
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        System.out.println(songList);
        System.out.println("----------------------");
        for (Song each: songList) {
            System.out.println(each);
            System.out.println("----------------------");
        }

        System.out.println("*******************************");
        songList.removeIf(each -> each.genre==null);
        System.out.println(songList);
        songList.add(song1);
        songList.add(song2);
        System.out.println("*******************************");
        songList.removeIf(each -> each.length>3.1);
        System.out.println(songList);

    }
}
