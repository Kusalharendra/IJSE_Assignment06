import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        System.out.print("Binary representation: ");
        printBinaryNumber(decimalNumber);

        scanner.close();
    }

    public static void printBinaryNumber(int decimalNumber) {
        int[] binaryArray = new int[32];
        int index = 0;

        while (decimalNumber > 0) {
            binaryArray[index++] = decimalNumber % 2;
            decimalNumber /= 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binaryArray[i]);
        }

        System.out.println(); 
    }
}
