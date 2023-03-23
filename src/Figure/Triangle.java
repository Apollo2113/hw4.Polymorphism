package Figure;

public class Triangle implements GeometricFigure {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * width * height;
    }
}
