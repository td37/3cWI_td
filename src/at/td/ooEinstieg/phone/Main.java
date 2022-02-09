package at.td.ooEinstieg.phone;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(1, "+436805004261");
        Camera camera = new Camera(12);
        SDCard sdCard = new SDCard(64000);
        Phone phone = new Phone(sim, camera, sdCard, "mystic black");


        phone.doCall("+436803206528");
        phone.makePicture();
        phone.makePicture();
        phone.makePicture();
        phone.printAllFiles();
        System.out.println(phone.getFreeSpace());
        phone.makePicture();
        System.out.println(phone.getFreeSpace());
    }
}
