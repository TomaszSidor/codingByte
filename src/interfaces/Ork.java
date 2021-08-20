package interfaces;

public class Ork implements Animal, Swimmable{

    @Override
    public int getAge() {
        return 101;
    }



    @Override
    public String getName() {
        return "Ork";
    }

    @Override
    public String speak() {
        return "YYYYYYYYYIIIOOO";
    }

    @Override
    public void swim() {
        System.out.println("Ork is swimming");
    }
}
