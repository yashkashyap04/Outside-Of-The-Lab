import java.util.Scanner;

class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers to swap: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swapped numbers are: "+ a+ " and "+ b);

        sc.close();
    }
}