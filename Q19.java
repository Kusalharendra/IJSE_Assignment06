public class Q19 {
    public static int m(int i) {
        System.out.print(i + ", ");
        return i;
        }
        public static void main(String s[]) {
        m(m(1) + m(2) % m(3) * m(4));
        }
        
}
