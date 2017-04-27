
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
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

        //Create counter for going through each spot in the array to find the prime numbers
        int x = 0;

        //Create an array for the cvonsecutive numbers
        int sieve[] = new int[1001];

        //Have the start of the array be two and the rest following two consecutivly
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = i;
        }

        //Create a counter to keep track of the prime number
        int P = 2;

        System.out.println("Prime numbers:");

        //Create an array to store the prime numbers
        int prime[] = new int[1001];

        //Go throught the seive values to check when the number in the sequence 
        //isn't the same as the prime multiple
        for (int i = 2; i < sieve.length; i++) {
            //Go throught the values of the prime multiples
            for (int j = 2; j < sieve.length; j++) {
                //Check if the number in sequence is a prime or if the number
                //isn't already a prime number used
                if (sieve[i] != (sieve[j] - 1) * P && i >= P) {
                    prime[i] = i;
                }
            }
        }
        //Create for loop rto read out the prime numbers
        for (int i = 2; i < sieve.length; i++) {
            System.out.println(prime[i]);
        }
    }
}
