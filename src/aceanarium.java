import java.util.Arrays;

public class aceanarium {
    private Shfuk[] shfuks;
    private Duck[] ducks;
    private Turtle[] turtles;


    public aceanarium(Shfuk[] shfuks, Duck[] ducks, Turtle[] turtles) {
        this.shfuks = shfuks;
        this.ducks = ducks;
        this.turtles = turtles;
    }

    public aceanarium() {

    }

    public Shfuk[] getShfuks() {
        return shfuks;
    }

    public void setShfuks(Shfuk[] shfuks) {
        this.shfuks = shfuks;
    }

    public Duck[] getDucks() {
        return ducks;
    }

    public void setDucks(Duck[] ducks) {
        this.ducks = ducks;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public void setTurtles(Turtle[] turtles) {
        this.turtles = turtles;
    }

    @Override
    public String toString() {
        return "aceanarium{" +
                "shfuks=" + Arrays.toString(shfuks) +
                ", ducks=" + Arrays.toString(ducks) +
                ", turtles=" + Arrays.toString(turtles) +
                '}';
    }
}
