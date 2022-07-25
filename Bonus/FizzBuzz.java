/* Lol, this code is not really useful. Its just to test my skills
 * Aim: if a the number you input is a multiple of 5 you get Fizz
 * if it is a multiple of 3 you get a Bizz
 * if it is a multiple of both 3 & 5 you get a FizzBuzz
 * If none of the conditions hold you get the number you input606
 */

import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int test = input.nextInt();

        if (test % 5 == 0 && test % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (test % 3 == 0) {
            System.out.println("Buzz");
        } else if (test % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(test);
        }

    }
}