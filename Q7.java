/*Define a method that takes an integer value and returns the number with its digits reversed.
(For example, given the number 7631, the function should return 1367.)*/

import java.util.Scanner;

public class Q7 {

    public static int reverseInteger(int n) {
        int reversedNumber = 0;

        while (n != 0) {
            
            int lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n = n / 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();

        int originalNumber = number;
        int reversedNumber = reverseInteger(number);

        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}

