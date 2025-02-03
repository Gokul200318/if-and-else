
import java.util.Scanner;

//Check whether an alphabet is vowel or consonant using if..else statement.
public class prbl3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch =scan.next().charAt(0);
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println(ch +" " + "it is vowel");
        }
        else{
            System.out.println(ch + " " + "it is consonant");
        }
    }
}
