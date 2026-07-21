package problem3;

public class Demo {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle("Circle", 5),
                new Ellipse("Ellipse", 8, 4),
                new Triangle("Triangle", 3, 4, 5),
                new EquilateralTriangle("Equilateral Triangle", 6)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println();
        }
    }
}
