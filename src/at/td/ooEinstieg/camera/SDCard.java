package at.td.ooEinstieg.camera;

import at.td.ooEinstieg.phone.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<Picture> pictures = new ArrayList<>();

    public SDCard(int capacity) {
        this.capacity = capacity;

    }

    public void saveFile(Picture picture){
        pictures.add(picture);
    }

    public int getFreeSpace(){
        int size = 0;
        for(Picture picture : pictures){
            size += picture.getSizeInMB();
        }
        return capacity - size;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Picture> getPictures() {
        return pictures;
    }
}
