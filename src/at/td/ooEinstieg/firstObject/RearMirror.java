package at.td.ooEinstieg.firstObject;

public class RearMirror {
    private int size;
    private int position; //0 neutral, -10 nach links, 10 nach rechts

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public void queryPositionOfRearMirror() {
        if (this.position == 0){
            System.out.println("Der Rückspiegel ist in neutraler Position.");
        }
        else if(this.position >= -10 && this.position < 0){
            System.out.println("Der Rückspiegel ist nach links verschoben.");
        }
        else if(this.position <= 10 && this.position > 0){
            System.out.println("Der Rückspiegel ist nach rechts verschoben");
        }
        else System.out.println("Der Rückspiegel ist in einer nicht möglichen Position");
    }

    public int getSize() {
        return size;
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
