package at.td.ooEinstieg.camera;

public class Picture {
    private String name;
    private String date;
    private Camera.SIZE size;
    private int sizeInMB;

    public Picture(String name, String date, Camera.SIZE size) {
        this.name = name;
        this.date = date;
        this.size = size;
        if (size == Camera.SIZE.LARGE){
            this.sizeInMB = 6;
        }
        else if (size == Camera.SIZE.MEDIUM){
            this.sizeInMB = 4;
        }
        else this.sizeInMB = 2;
    }

    public String getInfo(){
        return this.date + ":" + this.name + ":" + this.sizeInMB + "GB";
    }

    public int getSizeInMB() {
        return sizeInMB;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
