package UgurJava.Denemeler;

import java.util.*;

public class ReverseString {
    /*
    +1.Using StringBuilder/StringBuffer
    +2.Using Stack
    +3.Using Java Collections Framework reverse() method
    +4.Using character array
    5.Using character array and swap()
    +6.Using + (string concatenation) operator
    7.Using Unicode Right-to-left override (RLO) character
    8.Using a Byte Array
    9.Using Recursion
    10.Using substring() method
    */

    public static void main(String[] args) {
        String str= "No Matter How";
        method1For(str);
        method2For(str);
        method3StrBuilder(str);
        method4StrBuffer(str);
        method5ArrayList(str);
        method6Array(str);
        method7Stack(str);
        method8While(str);
    }

    private static void method8While(String str) {
        String reverse="";
        while (str.length() > 0) {
            reverse += str.charAt(str.length()-1);
            str = str.substring(0, str.length()-1);
        }
        System.out.println("while + substring ile: "+reverse);
    }

    private static void method7Stack(String str) {// Method to reverse a string in Java using a stack and character array
        Stack<Character> stack = new Stack<Character>();// create an empty stack of characters
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {// push every character of the given string into the stack
            stack.push(ch[i]);
        }
        int k = 0;
        while (!stack.isEmpty()) {// pop characters from the stack until it is empty
            // assign each popped character back to the character array
            ch[k++] = stack.pop();
        }
        System.out.println("Stack ile: "+String.copyValueOf(ch));
    }

    private static void method6Array(String str) {
        String[] strArray = str.split("");
        char[] arr = str.toCharArray();

        System.out.print("Array ile: ");
        for (int i = strArray.length-1; i >=0 ; i--) {
            System.out.print(strArray[i]);
        }
        System.out.println();//dummy

        System.out.print("Array ile: ");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();//dummy
    }

    private static void method5ArrayList(String str) {
        ArrayList<String> list = new ArrayList<String>(List.of(str.split("")));
        Collections.reverse(list);
        //System.out.println("Arraylist ile: "+list);

        String son []=list.toArray(new String[0]);
        System.out.println("Arraylist ile: "+String.join("", son));
    }

    private static void method4StrBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println("StringBuffer ile: "+sb.reverse());
    }

    private static void method3StrBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder ile: "+sb.reverse());
    }

    private static void method2For(String str) {
        String rvrs="";
        for(int i=str.length()-1; i>=0; i--) {
            rvrs += str.charAt(i);
        }
        System.out.println("For Loop ile: "+rvrs);
    }

    private static void method1For(String str) {
        String rvrs="";
        for(int i=0; i<str.length(); i++) {
            rvrs = str.charAt(i)+rvrs;
        }
        System.out.println("For Loop ile: "+rvrs);
    }
}
