public class Duck implements Swim{

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public Duck() {
    }

    @Override
    public void Swim() {
        System.out.println("Dusk swim");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
}
