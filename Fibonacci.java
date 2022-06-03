import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements to print: ");
        int number = scanner.nextInt();

        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i <= number; i++) {
            c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }

        scanner.close();
    }
}
