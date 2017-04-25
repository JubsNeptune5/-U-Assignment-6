
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Find the highest and lowest mark as well as the average
 *
 * @author laveh2107
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an input scanner
        Scanner input = new Scanner(System.in);

        //Ask how many marks does the teacher have
        System.out.println("Please enter the number of Students you have to mark");
        int x = input.nextInt();

        System.out.println("Please enter the " + x + " marks you have in percentages");

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

        //Create a counter to keep the sum of all the numbers in a array
        double s = 0;

        //Go through all the numkbers in the array to add them together
        for (int z = 0; z < marks.length; z++) {
            s = s + marks[z];
        }

        //Divid the sume by the length of the array
        double avg = s / marks.length;

        //State the info given
        //Give the teacher a good intro based on the class's marks
        if (avg >= 100) {
            System.out.println("Whooo, Your class must already work at Google");
        } else {
            if (avg >= 70) {
                System.out.println("Exellent, your teaching must have paid off");
            }
        }
        if (avg >= 50) {
            System.out.println("Here is the information on your satisfactory class");
        } else {
            if (avg < 50) {
                System.out.println("Wow, they must not know how to use a keyboard");
            }
        }

        System.out.println("The Lowest Mark is: " + marks[x - 1]);
        System.out.println("The Highest Mark is: " + marks[0]);
        System.out.println("The Average of the " + x + " Students is: " + avg);
    }
}
