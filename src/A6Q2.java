
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *See whose height is above average
 * @author laveh2107
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner for the inPut
        Scanner input = new Scanner(System.in);
        
        //Ask how many people's heights are measured
        System.out.println("How many people are being measured");
        //Create variable for how much students
        int m = input.nextInt();
        
        //Creat array for storing marks of the students
         double[] height = new double[m];
         
         //find the length of the array
         int length = height.length;
         
         //Ask the the heights
         System.out.println("Please enter the marks");
         //Create for loop to go through each section of the array
         for (int h = 0; h <length; h++) {
             //Find the value at variable m
             height[h] = input.nextDouble();
        }
         //Create variable to find the total sum of the marks
         double H = 0;
         
         //use for loop tom add all the marks together
         for (int i = 0; i <length; i++) {
            //Add the amrk at value m with the previous sum
            H = H + height[i];
        }
         
         //Divod the total sum by all the numbers in the array
         double Avg = H/length;
        
         //Say the average
         System.out.println("The average heights is: "+Avg);
         
         //Tell the the heights greater than Avg
         System.out.println("The heights are high higher than the Avg are:");
         //Create for loop
         for (int i = 0; i < length; i++) {
            //Check if the height is greater than the sum
             if(height[i]> Avg){
                 //Create variable to tell who the person 
                 int P = i+1;
                
                 System.out.println("The "+P+" person with a height of "+height[i]);
            }
        }
    }
}
