package problem3;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double s1, double s2, double s3) {
        super(name);
        if (s1 > 0 && s2 > 0 && s3 > 0 &&
                s1 + s2 > s3 &&
                s2 + s3 > s1 &&
                s3 + s1 > s2) {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        } else {
            System.out.println("Invalid side lengths.");
            System.exit(1);
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
