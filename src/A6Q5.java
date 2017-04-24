
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *Find the median within the array
 * @author laveh2107
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an input scanner
        Scanner input = new Scanner(System.in);

        //Ask how many marks does the teacher have
        System.out.println("Please enter the number of marks you have to mark");
        int x = input.nextInt();

        System.out.println("Please enter the " + x + " marks you have");

        //Create a array for the 10 marks
        double marks[] = new double[x];

        //Go thorugh all the places of the array
        for (int i = 0; i < marks.length; i++) {
            //Store the value inside the array
            marks[i] = input.nextDouble();
        }
        System.out.println("The numbers in acsending order are:");
        //Do the promgram while the counter is less then the length of the array so it covers all the places in the array
        for (int r = 0; r < marks.length; r++) {
            //Go throught the values of the second number being compared
            for (int i = 1; i < marks.length; i++) {
                //Change aroung the values if the first number is greater than the other one
                if (marks[i] > marks[i - 1]) {

                    //Create variables to represent the values og the first and second place being compared
                    double z = marks[i];
                    double y = marks[i - 1];

                    //Change the variables for the position on the arrays around
                    marks[i] = y;
                    marks[i - 1] = z;
                }
            }
        }
        //Do through the array in backwards order to show the numbers in ascendinig order
        for (int i = (marks.length - 1); i > -1; i--) {
            System.out.println(marks[i]);
        }

        //Create two variables to determine if the array has 
        //a odd or even number of places in the array
        int q = marks.length / 2;
        double w = marks.length / 2.0;

        System.out.println("The median is: ");

        //There are even places in the array if both variables are are equal
        if (q == w) {
            //Subratct the two middle numbers the divid to get the median of the array
            double a = (marks[q - 1] + marks[q]) / 2.0;
            System.out.println(a);
        }

        //There are even places in the array if both variables are are equal
        if (q != w) {
            //The middle number is the median
            double b = marks[q];
            System.out.println(b);
        }

    }
}
