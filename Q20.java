import java.util.*;

public class Q20 {

public static boolean isPass(Double avg){
            return avg>=35.0;
        
    }
public static void main(String args[]){

    Scanner input=new Scanner(System.in);
    System.out.print("Input average marks : ");

    double avg=input.nextDouble();
    System.out.println(isPass(avg) ? "Pass":"Fail");

    }
}
