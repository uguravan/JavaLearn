package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"
		 */
        Scanner input= new Scanner(System.in);
        System.out.print("enter mid-term grade :");
        int mid= input.nextInt();

        System.out.print("enter final grade :");
        int fin= input.nextInt();

        System.out.print("enter project grade :");
        int pro= input.nextInt();

        double grade= (3*mid/10)+(pro/5)+(fin/2);
        System.out.println("Your grade is : " + grade);
    }
}
