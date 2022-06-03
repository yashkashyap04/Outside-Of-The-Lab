import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }

        if (leap)
            System.out.println("Leap Year.");
        else
            System.out.println("Not a leap year.");
        
        scanner.close();
    }
}
