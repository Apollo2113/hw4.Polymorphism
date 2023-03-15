public class Triangle implements GeometricFigure {

    private double widht;
    private double height;

    public Triangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * widht * height;
    }
}
