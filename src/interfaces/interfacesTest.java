package interfaces;

public class interfacesTest {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Lion lion = new Lion();

        System.out.println(parrot.getAge());
        System.out.println(parrot.isAlive());
        System.out.println(lion.isAlive());
    }
}
