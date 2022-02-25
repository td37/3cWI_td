package at.td.ooEinstieg.musicbox;

import at.td.ooEinstieg.camera.Picture;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private int capacity = 50;
    private List<Record> records;

    public Magazine() {
        this.records = new ArrayList<>();
    }

    public Magazine(int capacity) {
        this.capacity = capacity;
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        if (this.capacity > this.records.size()) {
            this.records.add(record);
            System.out.println("Die Schallplatte wurde hinzugefüht.");
        } else {
            System.out.println("Es sind bereits " + this.capacity + " Schallplatten in der Musikbox");
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
        int recordListSize = this.records.size();
        int foundRecordPosition = 0;
        for (int i = 0; i < recordListSize ; i++) {

            if (recordTitle == this.records.get(i).getName()) {
                 foundRecordPosition = i;
            }
        }
        return foundRecordPosition+1;
    }

    public int loadRecord(String recordTitle) {
        int recordListSize = this.records.size();
        int foundRecordPosition = 0;
        for (int i = 0; i < recordListSize ; i++) {

            if (recordTitle == this.records.get(i).getName()) {
                foundRecordPosition = i;
            }
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
