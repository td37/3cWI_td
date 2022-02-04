package at.td.ooEinstieg.phone;

import at.td.ooEinstieg.remote.Battery;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> phoneFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public void addPhoneFiles(PhoneFile phoneFiles) {
        this.phoneFiles.add(phoneFiles);
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }
}
