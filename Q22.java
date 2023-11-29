import java.util.*;

public class Q22 {
    public static boolean isEven (int num){
        return num%2==0;
    }

public static void main(String args[]){

    Random r=new Random();

    for (int i = 0; i < 10; i++){
    int rand=r.nextInt(100);

    System.out.println(isEven(rand) ? rand+" is an even number" : rand+" is an odd number ");
    }
 }
}
