package UgurJava.interview;

public class Task03 {
    /*
 3 -->> Write a return method that can find the unique characters from the string
 Ex :   unique("AAABBBCCCDEF") ==> "DEF";*/
    public static void main(String[] args) {
        String s1 ="AAABBBCCCDEF";
        System.out.println(unique(s1));
    }
    public static String unique(String s1){
        String s2 = s1;
        int count;
        for (int i = 0; i <s1.length()-1; i++){
            count=0;
            for (int j = 0; j < s2.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                    if(count>1){
                        s2=s2.replace(String.valueOf(s2.charAt(j)), "");
                        j=0;
                    }
                }
            }
        }
        return s2;
    }
}
