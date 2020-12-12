package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> names = new ArrayList<>();

    public MusicBand(String name, int year){
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<String> names){
        this.name = name;
        this.year = year;
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String toString(){
        return ""+name+". "+ year + ". Members: "+names;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2){
        band2.names.addAll(band1.names);
        band1.names.clear();
    }

    public void printMembers(){
        System.out.println(names);
    }

    public List<String> getMembers(){
        return names;
    }
}
