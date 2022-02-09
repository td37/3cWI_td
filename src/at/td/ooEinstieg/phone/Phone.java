package at.td.ooEinstieg.phone;

import java.util.List;

public class Phone {
    private Sim sim;
    private Camera camera;
    private SDCard sdCard;
    private String colour;

    public Phone(Sim sim, Camera camera, SDCard sdCard, String colour) {
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;
        this.colour = colour;
    }

    public void makePicture(){
       PhoneFile phoneFile = this.camera.makePicture();
        this.sdCard.saveFile(phoneFile);
    }

    public void doCall(String number){
        this.sim.doCall(number);
    }

    public void printAllFiles(){
        List<PhoneFile> phoneFiles = this.sdCard.getPhoneFiles();
        for(PhoneFile phoneFile : phoneFiles){
            System.out.println(phoneFile.getInfo());
        }
    }

    public int getFreeSpace(){
        return this.sdCard.getFreeSpace();
    }

    public Sim getSim() {
        return sim;
    }

    public Camera getCamera() {
        return camera;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public String getColour() {
        return colour;
    }
}
