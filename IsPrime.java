import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean flag = true;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = !flag;
                System.out.println("Not a Prime Number.");
                break;
            }
        }

        if (!flag) {
            System.out.println("Prime Number.");
        }

        scanner.close();
    }
}