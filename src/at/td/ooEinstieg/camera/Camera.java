package at.td.ooEinstieg.camera;

import at.td.ooEinstieg.phone.PhoneFile;

import java.beans.PropertyEditorManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Camera {
    public enum SIZE {SMALL, MEDIUM, LARGE}

    private int pixel;
    private double weight;
    private String colour;
    private SIZE size;
    private SDCard card;
    private CameraManufacturer manufacturer;
    private Lens lens;
    private int fileNumber = 0;

    public Camera(int pixel, double weight, String colour, SIZE size, SDCard card, CameraManufacturer manufacturer, Lens lens) {
        this.pixel = pixel;
        this.weight = weight;
        this.colour = colour;
        this.size = size;
        this.card = card;
        this.manufacturer = manufacturer;
        this.lens = lens;
    }


    public void takePicture() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(date);

        Picture picture = new Picture("pic-" + fileNumber, strDate, this.size);
        if(this.card.getFreeSpace() >= picture.getSizeInMB()){
            this.card.saveFile(picture);
        }
        else {
            System.out.println("Du musst eine neue SD-Karte einfügen, du hast nur noch " + this.card.getFreeSpace() + "GB speicher frei.");
            System.out.println("Dein Bild würde " + picture.getSizeInMB() + "GB Speicher benötigen");
        }


        fileNumber++;
    }

    public void printAllFiles(){
        List<Picture> pictures = this.card.getPictures();
        for(Picture picture : pictures){
            System.out.println(picture.getInfo());
        }
    }

    public void getFreeSpace(){
        System.out.println(this.card.getFreeSpace());
    }

    public int getPixel() {
        return pixel;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public SIZE getSettingOfSize() {
        return size;
    }



    public CameraManufacturer getManufacturer() {
        return manufacturer;
    }

    public Lens getLens() {
        return lens;
    }
}
