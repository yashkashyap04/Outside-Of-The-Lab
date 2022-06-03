package Triangle;

public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    public Triangle (Point X, Point Y, Point Z) {
        A = X; B = Y; C = Z;
    }

    public double getPerimeter () {
        double perimeter = A.distance(B) + B.distance(C) + C.distance(A);
        return perimeter;
    }

    public boolean isRightAngled () {
        double sideA = A.distance(B);
        double sideB = B.distance(C);
        double sideC = C.distance(A);

        double hyp = sideA > sideB ? (sideA > sideC ? sideA : sideC) : (sideB > sideC ? sideB : sideC);

        return (sideA * sideA + sideB * sideB + sideC * sideC == 2 * hyp * hyp); 
    }
}
