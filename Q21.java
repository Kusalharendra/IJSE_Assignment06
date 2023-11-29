import java.util.Random;

public class Q21 {
    public static int abs(int num) {
        return (num < 0) ? -num : num;
    }
    public static void main(String args[]) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int rand = r.nextInt();
            System.out.println("Absolute value of " + rand + " : " + abs(rand));
        }
    }
}
