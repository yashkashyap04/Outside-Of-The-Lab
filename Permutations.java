import java.util.Scanner;

public class Permutations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        
        System.out.println("The permutations of a given string are: ");
        stringPermutation(s, "");

        sc.close();
    }

    static void stringPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            stringPermutation(ros, ans + ch);
        }
    }
}
