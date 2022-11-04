package UgurJava.interview;

public class Task02_removeDup {
    /*
 2 -->> Write a return method that can remove the duplicated values from string
 Ex : removeDup("AAABBBCCC") ==> ABC
 */
    public static void main(String[] args) {
        String str= "AAABABBCBCA";
        System.out.println(removeDup(str));
    }
    public static String removeDup(String str) {
        String s="";
        for(int i=0 ; i<str.length();i++){
            if(!s.contains(String.valueOf(str.charAt(i)))){
                s+=str.charAt(i);
            }
        }
        return s;
    }
}
