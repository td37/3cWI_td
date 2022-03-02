package at.td.ooEinstieg.musicbox;

public class Player {
    private boolean loaded = false;
    private int loadedRecordNumber;
    private Record record;
    private Magazine magazine;

    public Player(Magazine magazine) {
        this.loaded = loaded;
        this.loadedRecordNumber = loadedRecordNumber;
        this.record = record;
        this.magazine = magazine;
    }

    public int loadRecord(String recordTitle) {
        this.loaded = true;
        return this.loadedRecordNumber = this.magazine.loadRecord(recordTitle);
    }


    public void play(int num) {
        if (loaded) {
            System.out.println("Der Titel " + this.magazine.getRecords().get(loadedRecordNumber).getSongList().get(num-1).getName() + " wird abgespielt.");
        } else{
            System.out.println("Es wurde keine Platte eingelegt.");
        }
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
}
