package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> artists = new ArrayList<>();

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<MusicArtist> artists){
        this.name = name;
        this.year = year;
        this.artists = artists;
    }


    public String toString(){
        return ""+name+". "+ year + ". Members: "+artists;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2){
        band2.artists.addAll(band1.artists);
        band1.artists.clear();
    }

    public void printMembers(){
        System.out.println(artists);
    }

    public List<MusicArtist> getMembers(){
        return artists;
    }
}
