package interfaces;

public class Lion implements Animal {

    @Override
    public int getAge() {
        return 14;
    }


    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public String speak() {
        return "AAAAGGRRRRR";
    }
}
