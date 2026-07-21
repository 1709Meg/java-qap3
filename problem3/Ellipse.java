package problem3;

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(String name, double a, double b) {
        super(name);
        if (a > b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * (a * b);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(
                (2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(a - b, 2)) / 2);
    }

}
