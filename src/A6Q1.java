
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Find the average between three students
 * @author laveh2107
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create scanner for input
        Scanner input = new Scanner(System.in);
        
        //Ask how many students
        System.out.println("How many students are the class");
        //Create variable for how much students
        int s = input.nextInt();
        
        //Creat array for storing marks of the students
         double[] marks = new double[s];
         
         //find the length of the array
         int length = marks.length;
         //Ask the marks of the students
         System.out.println("Please enter the marks");
         //Create for loop to go through each section of the array
         for (int m = 0; m <length; m++) {
             //Find the value at variable m
             marks[m] = input.nextDouble();
        }
         //Create variable to find the total sum of the marks
         double M = 0;
         
         //use for loop tom add all the marks together
         for (int i = 0; i <length; i++) {
            //Add the amrk at value m with the previous sum
            M = M + marks[i];
        }
         
         //Divod the total sum by all the numbers in the array
         double Avg = M/length;
         
         //Tell teacher the average
         System.out.println("Your Average for your class is "+Avg);
    }
}
