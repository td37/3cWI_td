package at.td.ooEinstieg.firstObject;

public class Tire {
    public enum TYPE {WINTERTIRES, SUMMERTIRES};

    private int rimDiameter;
    private int profileThickness;
    private TYPE type;

    public Tire(int diameter, int profileThickness, TYPE type) {
        this.rimDiameter = diameter;
        this.profileThickness = profileThickness;
        this.type = type;
    }

    public int getRimDiameter() {
        return rimDiameter;
    }

    public int getProfileThickness() {
        return profileThickness;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
