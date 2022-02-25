package at.td.ooEinstieg.musicbox;

import at.td.ooEinstieg.camera.Picture;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private int id;
    private String name;
    private List<Song> songList;

    public Record(int id, String name) {
        this.id = id;
        this.name = name;
        this.songList = new ArrayList<>();
    }

    public void addSong (Song songList){
        this.songList.add(songList);
    }

    public double getSumOfMusic() {
        double sumOfSongLength = 0;
        int howManyTitles = this.getSongList().size();
        for (int i = 0; i < howManyTitles; i++) {
            sumOfSongLength += this.songList.get(i).getLength();
        }
        return sumOfSongLength;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongList() {
        return songList;
    }

}
