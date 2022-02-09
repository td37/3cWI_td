package at.td.ooEinstieg.phone;

public class Camera {
    private int resolution;
    private int fileNumber = 0;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public PhoneFile makePicture(){
        PhoneFile phoneFile = new PhoneFile("png", 500, "pic-" + fileNumber);
        fileNumber++;
        return phoneFile;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
