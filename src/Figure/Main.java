package Figure;

public class Main {
    public static void main(String[] args) {
        GeometricFigure [] figures = {new Circle(7), new Square(4,4), new Triangle(10,5)};
        double totalArea = 0;
        for (GeometricFigure figure : figures) {
            totalArea += figure.getArea();
        }
        System.out.println("Total area: " + totalArea);
    }
}