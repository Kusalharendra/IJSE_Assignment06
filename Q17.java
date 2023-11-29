public class Q17 {
    public static void printNumber(int i) {
        System.out.print(i + " ");
    }

    public static void main(String as[]) {
        int i = 1, j = 2, k = 3;
        printNumber(i++);
        printNumber(++j);
        k = i++ + j++;
        printNumber(k++);
        System.out.print(i + " " + j + " " + k);
    }
}
