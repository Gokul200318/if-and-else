
/*Write a java program to input a cost of a pen and calculate 70 pens cost with some discount. if total pen cost greater than 1000 then we calculate 20% discount otherwise 10%.*/

import java.util.Scanner;


public class prbl4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the cost of the pen"); 
        int cost = scan.nextInt();
        int totalcost = cost * 70;
    
        if (totalcost>1000){
           int dis = totalcost*20/100; 
           System.out.println("pay only" + " " + (totalcost-dis));
        }
        else{
            int dis = totalcost*10/100; 
           System.out.println("pay only" + " " + (totalcost-dis));
        }
        scan.close();

    }
}
