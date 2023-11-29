//Write a Java method to find & print the area of a circle when the user inputs the radius

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius of the circle : ");
        double radius = scan.nextDouble();

        double area = 22/7*radius*radius;
        System.out.println("Area of a circle = "+ area);
    }
}
