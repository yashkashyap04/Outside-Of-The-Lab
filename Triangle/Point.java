package Triangle;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    public double distance (Point A) {
        double xComponent = (x - A.x) * (x - A.x);
        double yComponent = (x - A.y) * (x - A.y);

        return Math.sqrt(xComponent + yComponent);
    }
}
