public class Shfuk implements Swim  {

    private String name;

    public Shfuk(String name) {
        this.name = name;
    }

    @Override
    public void Swim() {
        System.out.println("Shfuk Swim");
    }

    @Override
    public String toString() {
        return "Shfuk{"+name+"}";
    }
}
