package exercises.Composition;


public class Lamp {
    private final String style;
    private final boolean battery;
    private final int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("lamp is being turned on");
    }

    public String getStyle() {
        return this.style;
    }

    public boolean isBattery() {
        return this.battery;
    }

    public int getGlobRating() {
        return this.globRating;
    }
}
