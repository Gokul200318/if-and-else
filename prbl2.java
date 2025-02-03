
import java.util.Scanner;

//Write a program to take two number from user and check who is max.

public class prbl2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the numbers");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if (n1 == n2){
            System.out.println("Both are same");
        }
        else if(n1>n2){
            System.out.println("n1 is max number");
        }
        else{
            System.out.println("n2 is max number");
        }
    }
}
