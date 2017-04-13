
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create input scanner
        Scanner input = new Scanner(System.in);
        
        //create array
        int[] num = new int[2];
        
        //Ask them to enter the numbers
        System.out.println("Please enter the two integers");
        //create for loop to place characters in the array
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        //if first number is greater then the second
        if(num[0]>num[1]){
            System.out.println("The Digits in accending order are : "+num[1]+", "+num[0]);
        }
        
        //if the number is less than the second number
        if(num[0]<num[1]){
            System.out.println("The Digits in accending order are : "+num[0]+", "+num[1]);
        }
    }
}
