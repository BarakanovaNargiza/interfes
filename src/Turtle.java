public class Turtle implements Swim{
    @Override
    public void Swim() {
        System.out.println("name swim");

    }
    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                '}';
    }
}
