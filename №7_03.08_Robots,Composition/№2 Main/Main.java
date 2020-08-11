package second;

public class Main {
    public static void main(String[] args) {
        Car landRover = new Car();
        landRover.color = "Brown";
        System.out.println("Color of the car: " + landRover.color);

        landRover.body.setLength(4.8);
        landRover.body.setShape("Sport");
        System.out.println(landRover.body.getLength());
        System.out.println(landRover.body.getShape());

        landRover.helm.setRadius(0.35);
        landRover.helm.setShape("Circle");
        System.out.println(landRover.helm.getRadius());
        System.out.println(landRover.helm.getShape());

        landRover.wheel.setRadius(0.4);
        landRover.wheel.setShape("Circle");
        System.out.println(landRover.wheel.getRadius());
        System.out.println(landRover.wheel.getShape());


    }
}
