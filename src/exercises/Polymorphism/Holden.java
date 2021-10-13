package exercises.Polymorphism;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Starting the Holden";
    }

    @Override
    public String accelerate() {
        return "Accelerating the Holden";
    }

    @Override
    public String brake() {
        return "Braking the Holden";
    }
}
