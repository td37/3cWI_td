package at.td.ooEinstieg.musicbox;

public class Box {
    private String name;
    private Magazine magazine;
    private Player player;

    public Box(String name, Magazine magazine, Player player) {
        this.name = name;
        this.magazine = magazine;
        this.player = player;
    }

    public void removeRecord(int recordToRemove) {
        this.magazine.removeRecord(recordToRemove);
    }

    public void getSumOfMusic(){
        System.out.println("Die Lieder auf allen Festplatten haben eine gesamtlänge von " + this.magazine.getSumOfMusic() + " min.");
    }

    public void searchRecord(String recordTitle){
        System.out.println("Die gesuchte Platte hat die Stelle " + this.magazine.searchRecord(recordTitle) + " im Magazine.");
    }

    public void loadRecord(String recordTitle){
        this.player.loadRecord(recordTitle);
    }

    public void play(int num){
        this.player.play(num);
    }


    public String getName() {
        return name;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public Player getPlayer() {
        return player;
    }
}
