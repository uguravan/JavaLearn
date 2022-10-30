package UgurJava.j20_PassByValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskRomanToNumbers {
 /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805

		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		*/
    static char[] romans = {'I','V','X','L','C','D','M'};
    static ArrayList<Integer> romansInt = new ArrayList<>(List.of(1,5,10,50,100,500,1000));

 public static void main(String[] args) {
     String romanNumeral="MCMXCIV";
     int result = romanToInteger(romanNumeral);

     System.out.println("Roman Numeral is: "+romanNumeral);
     System.out.println("Integer Value is: "+result);

     System.out.println();

     romanNumeral="DCCXCIX";
     result = romanToInteger(romanNumeral);

     System.out.println("Roman Numeral is: "+romanNumeral);
     System.out.println("Integer Value is: "+result);
 }
 public static int romanToInteger(String romanNumeral) {

     int result = 0;
     for (int i = 0; i < romanNumeral.length(); i++) {
         for (int j = 0; j < romans.length; j++) {
             if (romans[j]==(romanNumeral.charAt(i))){}
         /*        if (i > 0 && romansInt[j]>romansInt[romans.indexOf(romanNumeral.charAt(i-1))]) {

                 }else result += romansInt[j];*/
         }
     }
     return result;
 }
 }

