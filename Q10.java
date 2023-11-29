public class Q10 {
    public static long findSmallestMultiple() {
        long smallestMultiple = 1;

        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                int maxPower = 1;
                while (maxPower * i <= 20) {
                    maxPower *= i;
                }
                smallestMultiple *= maxPower;
            }
        }

        return smallestMultiple;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long result = findSmallestMultiple();
        System.out.println("The smallest positive number evenly divisible by all numbers from 1 to 20 is: " + result);
    }
}
