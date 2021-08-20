package interfaces;

public class Fly implements Animal, Flyable {
    @Override
    public String getName() {
        return "Fly";
    }

    @Override
    public String speak() {
        return "Bzbzbzbzzbyyy";
    }

    @Override
    public void fly() {
        System.out.println("Fly is flying");
    }

    @Override
    public int getAge() {
        return 1;
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
