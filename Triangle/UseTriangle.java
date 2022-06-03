package Triangle;

public class UseTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 4));

        System.out.println("Perimeter of triangle: " + triangle.getPerimeter());
        System.out.println("Right Angled Triangle?: " + triangle.isRightAngled());
    }
}
