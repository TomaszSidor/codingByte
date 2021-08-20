package interfaces;

public class Parrot implements Animal, Flyable {

    @Override
    public String getName() {
        return "Parrot";
    }

    @Override
    public String speak() {
        return "Hello Idiot!";
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public int getAge() {
        return 6;
    }
}
