
import java.util.Scanner;

//Write a program for checking enter number is even or odd.

class prbl1{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        if (n%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
    }
}