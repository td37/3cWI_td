package at.td.ooEinstieg.musicbox;

public class Box {
    private String name;
    private Magazine magazine;

    public Box(String name, Magazine magazine) {
        this.name = name;
        this.magazine = magazine;
    }

    public void removeRecord(int recordToRemove) {
        this.magazine.removeRecord(recordToRemove);
    }

    public void getSumOfMusic(){
        System.out.println("Die Lieder auf allen Festplatten haben eine gesamtlänge von " + this.magazine.getSumOfMusic() + " min.");
    }

    public void searchRecord(String recordTitle){
        System.out.println("Die gesuchte Platte hat die Stelle " + this.magazine.searchRecord(recordTitle) + "im Magazin.");
    }

    public String getName() {
        return name;
    }

    public Magazine getMagazine() {
        return magazine;
    }
}
