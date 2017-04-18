
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
        
        //create array for integers
        int[] num = new int[2];
        
        //Ask them to enter the numbers
        System.out.println("Please enter the two integers");
        
        //create for loop to place characters in the array
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        //Create integers to changwe the array
        int a = num[1];
        int b = num[0];
         
        //if the number is less than the second number the order of the array will stay the same
        if(num[0]<num[1]){
            
            //Print out the same array as before
            System.out.println("The Digits in accending order are : "+num[0]+", "+num[1]);
        }
        
        //if first number is greater then the second change the order for the numbers in the array 
        if(num[0]>num[1]){
            
            //Change the values of places int he array to match asending order
            num[0] = a;
            num[1]=b;
            
            //Print out new array
            System.out.println("The Digits in accending order are : "+num[0]+", "+num[1]);
        }
 
    }
}
