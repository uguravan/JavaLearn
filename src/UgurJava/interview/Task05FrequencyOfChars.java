package UgurJava.interview;

import java.util.Arrays;
import java.util.Collections;

public class Task05FrequencyOfChars {
    /*
5 -->>  Write a return method that can find the frequency of characters
Ex :  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/
    public static void main(String[] args) {
        String s1 ="AAABBCDD";
        System.out.println(FrequencyOfChars(s1));
    }
    public static String FrequencyOfChars(String s1) {
        String freq="";
        for (String ch : s1.split("")){
            freq+= Collections.frequency(Arrays.asList(s1.split("")), ch)>0? freq.contains(ch)? "":ch+Collections.frequency(Arrays.asList(s1.split("")), ch):"";
        }
        return freq;
    }
}
