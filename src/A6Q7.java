
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Find the prime numbers between 2 and 1000
 *
 * @author laveh2107
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create input scanner
        Scanner input = new Scanner(System.in);

        //Create an array for the cvonsecutive numbers
        int sieve[] = new int[1001];
        
        //fill the array with numbers starting at 2 and add consecutivly
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = i;
        }

        //Go throught the numbers to find the multiples of the prime  number
        for (int i = 2; i < sieve.length; i++) {
            //Get the multiples at the position "i"
            for (int j = 0; j < 1001; j = j + i) {
                if (j > i) {
                    //set sieve position at 0 to get rid of later
                    sieve[j] = 0;
                }
            }
        }
        //Print out the other numbers that arne't zero's
        for (int i = 0; i < sieve.length; i++) {
            //Get rid of the multiples of the position, that aren't zero's
            if (sieve[i] != 0) {
                System.out.println(sieve[i]);
            }
        }

    }
}
