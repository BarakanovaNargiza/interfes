public class Main {
    public static void main(String[] args) {
        Shfuk shfuk1 = new Shfuk("Shfut1");
        Shfuk shfuk2 = new Shfuk("Shfut2");
        Shfuk shfuk3 = new Shfuk("shfut3");
        Shfuk shfuk4 = new Shfuk("Shfut4");
        Shfuk shfuk5 = new Shfuk("Shfut5");
        Shfuk[] shfuks={shfuk1,shfuk2,shfuk3,shfuk4,shfuk5};
        Duck duck = new Duck("duck");
        Duck duck1 = new Duck("duck1");
        Duck duck2 = new Duck("duck2");
        Duck duck3 = new Duck("duck3");
        Duck duck4 = new Duck("duck4");
        Duck[] ducks = {duck,duck1,duck2,duck3,duck4,};
        Turtle turtle = new Turtle("turtle1");
        Turtle turtle1 = new Turtle("turtle2");
        Turtle turtle2 = new Turtle("turtle3");
        Turtle turtle3 = new Turtle("turtle4");
        Turtle turtle4 = new Turtle("turtle5");
        Turtle[] turtles = {turtle,turtle1,turtle2,turtle3,turtle4};
        aceanarium a1=new aceanarium(shfuks,ducks,turtles);
        System.out.println(a1.toString());
        turtle2.Swim();
        shfuk2.Swim();
        duck2.Swim();
    }
}

