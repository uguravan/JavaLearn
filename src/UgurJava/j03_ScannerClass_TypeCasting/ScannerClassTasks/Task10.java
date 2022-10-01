package UgurJava.j03_ScannerClass_TypeCasting.ScannerClassTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.
// formula
    // c = (f-32)*5/9

        Scanner input= new Scanner(System.in);
        System.out.print("Fahrenheit dereceyi giriniz : ");
        double fah= input.nextInt();
        System.out.print("temperature is "+((fah-32)*5/9)+" Celsius degree.");
    }
}
