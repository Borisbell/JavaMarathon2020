package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("Jon Joneson", 22);
        MusicArtist artist2 = new MusicArtist("Mike Mikelson", 24);
        MusicArtist artist3 = new MusicArtist("Brian Brianson", 31);
        MusicArtist artist4 = new MusicArtist("Luke Lukelson", 16);

        List<MusicArtist> bandList1 = new ArrayList<>();
        bandList1.add(artist1);
        bandList1.add(artist2);

        List<MusicArtist> bandList2 = new ArrayList<>();
        bandList2.add(artist3);
        bandList2.add(artist4);

        MusicBand band1 = new MusicBand("Kotlin Park", 1999, bandList1);
        MusicBand band2 = new MusicBand("Snow Java", 1998, bandList2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
