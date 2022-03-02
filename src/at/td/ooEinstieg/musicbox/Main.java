package at.td.ooEinstieg.musicbox;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song(3.4, "Watermelonsugar");
        Song s2 = new Song(4.2, "Look who's crying now");
        Song s3 = new Song(2.5, "Fight Back");

        System.out.println(s1.getLength());

        Record r1 = new Record(1,"Red");
        Record r2 = new Record(2,"Butter");
        Record r3 = new Record(3,"Heart");

        r1.addSong(s1);
        r1.addSong(s2);

        r2.addSong(s1);
        r2.addSong(s3);

        r3.addSong(s1);
        r3.addSong(s3);

        List<Song> songList = r1.getSongList();
        for(Song song : songList){
            System.out.println(song.getLength());
        }

        System.out.println(r1.getSumOfMusic());

        Magazine mag = new Magazine(2);

        mag.addRecord(r1);
        mag.addRecord(r2);
        //mag.addRecord(r3);

        List<Record> recordList = mag.getRecords();
        for(Record record : recordList){
            System.out.println(record.getName());
        }

        System.out.println(mag.searchRecord("Red"));

        Player player = new Player(mag);

        Box box = new Box("coole Box", mag, player);
        box.getMagazine();
        box.getSumOfMusic();
        box.searchRecord("Butter");

        //box.loadRecord("Red");

        box.play(1);




    }
}
