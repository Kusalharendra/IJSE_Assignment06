
//Write a Java method to input marks for 10 subjects and find the total and average.

import java.util.Scanner;

public class Q3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int numberOfSubjects = 10;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();

            totalMarks += marks;
        }
        System.out.println("\nTotal Marks: " + totalMarks);
    }    

}
