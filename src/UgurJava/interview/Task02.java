package UgurJava.interview;

import java.util.Arrays;

public class Task02 {
    /*
 2 -->> Write a return method that can remove the duplicated values from string
 Ex : removeDup("AAABBBCCC") ==> ABC
 */
    public static void main(String[] args) {
        String s1 ="AAABBBCCC";
        removeDup(s1);
    }
    public static void removeDup(String s1){
        String s2 = s1;
        int count;
        for (int i = 0; i <s1.length()-1; i++) {
            count=0;
            for (int j = 0; j < s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                    if(count>1){
                        s2=s2.substring(0,j).concat(s2.substring(j+1));
                        j--;
                    }
                }
            }
        }
        System.out.println(s2);
    }
}
