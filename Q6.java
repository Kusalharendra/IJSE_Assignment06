    //Write a Java method to find out the sum of digits of a number input by the user.

    import java.util.Scanner;

    public class Q6 {

        public static int sumOfDigits(int num) {
            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            return sum;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = scan.nextInt();

            int sum = sumOfDigits(num);
            System.out.println("The sum of digits in the number is: " + sum);
        }
    }
