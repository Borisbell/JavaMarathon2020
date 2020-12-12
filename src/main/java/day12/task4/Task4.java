package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Kotlin Park", 1999);
        MusicBand band2 = new MusicBand("Snow Java", 1998);
        List<String> names1 = new ArrayList<>();
        names1.add("James Jameson");
        names1.add("Philip Philipson");
        band1.setNames(names1);

        List<String> names2 = new ArrayList<>();
        names2.add("Martin Martinson");
        names2.add("Karl Karlson");
        band2.setNames(names2);

        System.out.println(band1);
        System.out.println(band2);

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}
