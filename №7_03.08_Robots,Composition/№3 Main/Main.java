package third;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Leopard", 100, 12);
        System.out.println(animal.getName() + " " + animal.getSpeed() + " " + animal.getAge());

        animal.setName("Bull");
        animal.setSpeed(40);
        animal.setAge(15);

        System.out.println(animal.getName() + " " + animal.getSpeed() + " " + animal.getAge());
    }
}
