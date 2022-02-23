package at.td.ooEinstieg.musicbox;

import at.td.ooEinstieg.camera.Picture;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private int capacity = 50;
    private List<Record> records;

    public Magazine(int capacity) {
        this.capacity = capacity;
        this.records = new ArrayList<>();
    }

    public void addRecords(Record record) {
        if (this.capacity > this.records.size()) {
            this.records.add(record);
            System.out.println("Die Schallplatte wurde hinzugefüht.");
        } else {
            System.out.println("Es sind bereits 50 Schallplatten in der Musikbox");
        }

    }

    public void removeRecord(int recordToRemove) {
        this.records.remove(recordToRemove - 1);
        System.out.println("Die " + recordToRemove + ". Schallplatte wurde entfernt.");
    }

    public double getSumOfMusic() {
        int howManyRecords = this.records.size();
        double sumOfRecords = 0;

        for (int i = 0; i < howManyRecords; i++) {
            sumOfRecords += this.records.get(i).getSumOfMusic();
        }
        return sumOfRecords;
    }

    public int searchRecord(String recordTitle) {
        int recordPosition = 0;
        int foundRecordPosition = -1;
        for (int i = this.records.size(); i > -1 ; i--) {

            if (recordTitle == this.records.get(recordPosition).getName()) {
                 foundRecordPosition = recordPosition;
            }
            recordPosition--;
        }
        return foundRecordPosition;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Record> getRecords() {
        return records;
    }
}
