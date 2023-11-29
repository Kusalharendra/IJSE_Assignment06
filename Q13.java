import java.util.Random;

public class Q13 {
    class Example {
    Random r = new Random(); // You may want to move this line to the main method if you intend to use it there.

    public static void main(String args[]) {
        Random r = new Random();
        //getNumbers(); // Line 1

        int x = getNumbers(10); // Line 2
      //  getTotal(100, 10.0); // Line 3
        //int total = getTotal(10.0, 100); // Line 4
    }

    //public static int getNumbers() {
       // Random r = new Random(); // Line 5
        int x = r.nextInt(10); // Line 6
        int y = r.nextInt(5); // Line 7
        //return x, y; // Line 8 - Compile error here
    }

    public static int getNumbers(int x) {
        //x = r.nextInt(x); // Line 9 - Compile error, r cannot be resolved
        return x; // Line 10
    }

    //public static int getTotal(int x, double d) {
        //return x + d; // Line 11- Compile error
    }

    public static double getTotal(double x, int d) {
        return x + d; // Line 12
    }
}

