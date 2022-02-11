package at.td.ooEinstieg.camera;

public class Lens {
    private String lensManufacturer;
    private int focalLength;

    public Lens(String lensManufacturer, int focalLength) {
        this.lensManufacturer = lensManufacturer;
        this.focalLength = focalLength;
    }

    public String getLensManufacturer() {
        return lensManufacturer;
    }

    public int getFocalLength() {
        return focalLength;
    }
}
