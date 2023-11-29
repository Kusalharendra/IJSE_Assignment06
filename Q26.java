public class Q26 {


        // Method to convert an integer to binary string
        public static String toBinaryString(int num) {
            return Integer.toBinaryString(num);
        }
    
        // Method to convert an integer to octal string
        public static String toOctalString(int num) {
            return Integer.toOctalString(num);
        }
    
        // Method to convert an integer to hexadecimal string
        public static String toHexString(int num) {
            return Integer.toHexString(num);
        }
    
        public static void main(String args[]) {
            System.out.println(toBinaryString(100)); // 1100100
            System.out.println(toOctalString(100));  // 144
            System.out.println(toHexString(100));    // 64
        }
    
}
