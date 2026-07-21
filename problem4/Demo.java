package problem4;

public class Demo {

    public static void scaleShapes(Scalable[] shapes, double scaleFactor) {
        for (Scalable shape : shapes) {
            shape.scale(scaleFactor);
        }
    }

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle("Circle", 5),
                new Ellipse("Ellipse", 8, 4),
                new Triangle("Triangle", 3, 4, 5),
                new EquilateralTriangle("Equilateral Triangle", 6)
        };

        System.out.println("Before Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2);

        System.out.println("\nAfter Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}