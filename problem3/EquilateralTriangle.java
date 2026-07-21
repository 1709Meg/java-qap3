package problem3;

public class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
