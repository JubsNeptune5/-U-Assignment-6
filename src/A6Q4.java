
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laveh2107
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an input scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the ten marks");

        //Create a array for the 10 marks
        double marks[] = new double[10];
       
        //Go thorugh all the places of the array
        for (int i = 0; i < 10; i++) {
            //Store the value inside the array
            marks[i] = input.nextDouble();
        }
        System.out.println("The numbers in acsending order are:");
        //Do the promgram while the counter is less then the length of the array so it covers all the places in the array
        for (int r = 0; r < 10; r++) {
            //Go throught the values of the second number being compared
            for (int i = 1; i < 10; i++) {
                //Change aroung the values if the first number is greater than the other one
                if (marks[i] > marks[i - 1]) {
                    
                    //Create variables to represent the values og the first and second place being compared
                    double x = marks[i];
                    double y = marks[i - 1];

                    //Change the variables for the position on the arrays around
                    marks[i] = y;
                    marks[i - 1] = x;
                }
            }
        }
        //Do through the array in backwards order to show the numbers in ascendinig order
        for (int i = 9; i> -1; i--) {
            System.out.println(marks[i]);
        }
    }
}
