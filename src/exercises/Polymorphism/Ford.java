package exercises.Polymorphism;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Starting the Ford";
    }

    @Override
    public String accelerate() {
        return "Accelerating the Ford";
    }

    @Override
    public String brake() {
        return "Braking the Ford";
    }
}
