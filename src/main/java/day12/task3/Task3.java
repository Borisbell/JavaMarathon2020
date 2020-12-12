package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Kotlin Park", 1999);
        MusicBand band2 = new MusicBand("Snow Java", 1998);
        MusicBand band3 = new MusicBand("Java Bizkit", 1997);
        MusicBand band4 = new MusicBand("Javallica", 1996);
        MusicBand band5 = new MusicBand("Java Fighters", 2005);
        MusicBand band6 = new MusicBand("Java2", 1994);
        MusicBand band7 = new MusicBand("Bon Java", 1993);
        MusicBand band8 = new MusicBand("Kotlin 5", 1992);
        MusicBand band9 = new MusicBand("30 seconds to Java", 2000);
        MusicBand band10 = new MusicBand("Kings of Kotlin", 2001);
        MusicBand band11 = new MusicBand("My Chemical Java", 2003);

        List<MusicBand> bands1 = new ArrayList<>();
        bands1.add(band1);
        bands1.add(band2);
        bands1.add(band3);
        bands1.add(band4);
        bands1.add(band5);
        bands1.add(band6);
        bands1.add(band7);
        bands1.add(band8);
        bands1.add(band9);
        bands1.add(band10);
        bands1.add(band11);
        Collections.shuffle(bands1);
        System.out.println(bands1);

        System.out.println(groupsAfter2000(bands1));;

    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsNew = new ArrayList<>();
        for(MusicBand x : bands){
            if(x.getYear()>2000){
                bandsNew.add(x);
            }
        }
        return bandsNew;
    }
}
