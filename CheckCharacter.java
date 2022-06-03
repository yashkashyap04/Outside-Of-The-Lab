import java.util.*;

class CheckCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0); 

        if ((ch >= 65 && ch <= 90) || (ch >=97 && ch <=122) ) {
            System.out.println("The entered character is an Alphabet");
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                System.out.println("It is a Vowel");
            else
                System.out.println("It is a consonant");
        }
        
        else
            System.out.println("The entered character is not an Alphabet");

        sc.close();
    }
}