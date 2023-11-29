public class Q8 {
    
    public static boolean isArmstrongNumber(int number) {

        int numDigits = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            tempNumber /= 10;
            numDigits++;
        }

        int armstrongSum = 0;
        tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            armstrongSum += Math.pow(digit, numDigits);
            tempNumber /= 10;
        }

        return armstrongSum == number;
    }

    public static void main(String[] args) {
        int number = 153;
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
