package exercises.Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders, wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "The Car engine is starting";
    }

    public String accelerate(){
        return "The Car is accelerating";
    }

    public String brake(){
        return "The Car is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
