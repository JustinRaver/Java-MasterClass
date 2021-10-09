package exercises.Polymorphism;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Starting the Mitsubishi";
    }

    @Override
    public String accelerate() {
        return "Accelerating the Mitsubishi";
    }

    @Override
    public String brake() {
        return "Braking the Mitsubishi";
    }
}
