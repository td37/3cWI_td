package at.td.ooEinstieg.camera;

public class Main {
    public static void main(String[] args) {
        SDCard card = new SDCard(500);
        Lens lens = new Lens("Canon", 200);
        CameraManufacturer manufacturer = new CameraManufacturer("Sony", "China");
        Camera camera = new Camera(50, 3, "mysterious black", Camera.SIZE.LARGE, card, manufacturer, lens);

        camera.takePicture();
        camera.takePicture();

        camera.printAllFiles();
        camera.getFreeSpace();

    }
}
