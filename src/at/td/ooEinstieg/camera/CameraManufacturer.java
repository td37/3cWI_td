package at.td.ooEinstieg.camera;

public class CameraManufacturer {
    private String name;
    private String origin;

    public CameraManufacturer(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }
}
