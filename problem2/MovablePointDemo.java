package problem2;

public class MovablePointDemo {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("Default Point: " + p1);

        Point p2 = new Point(1.0f, 2.0f);
        System.out.println("Point: " + p2);

        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println("Before move: " + mp);

        mp.move();
        System.out.println("After move: " + mp);

        float[] coordinates = mp.getXY();
        System.out.println("Coordinates: (" + coordinates[0] + "," + coordinates[1] + ")");

        float[] speed = mp.getSpeed();
        System.out.println("Speed: (" + speed[0] + "," + speed[1] + ")");
    }
}
