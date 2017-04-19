
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

        //Create counter to change places in the array
        int t = 0;

        System.out.println("Please enter the ten marks");

        //Create a array for the 10 marks
        double marks[] = new double[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        System.out.println("The numbers in acsending order are:");
        //Do the promgram while the counter is less then the length of the array so it covers all the places in the array
        //while (t < marks.length) {
        for (int i = 0; i < (marks.length - 1); i++) {
            double x = marks[i];
            for (int j = 1; j < marks.length; j++) {
                double y = marks[j];

                if (x > y) {
                    marks[i] = y;
                    marks[j] = x;
                    System.out.println(marks[i]);
                }

                //t++;
            }

        }
        //}
    }
}
