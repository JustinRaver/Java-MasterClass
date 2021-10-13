package exercises.Composition;

public class Ceiling {
    private final int height;
    private final int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPaintedColor() {
        return this.paintedColor;
    }
}
