package UgurJava.Lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    /*
    +1.Using StringBuilder/StringBuffer
    +2.Using Stack
    +3.Using Java Collections Framework reverse() method
    +4.Using character array
    +5.Using character array and swap()
    +6.Using + (string concatenation) operator
    +7.Using Unicode Right-to-left override (RLO) character
    +8.Using a Byte Array
    +9.Using Recursion
    +10.Using substring() method
    +11.Using Lambda Expression
    */

    public static void main(String[] args) {
        String str= "No Matter How";
        method1ForSondanBaşla(str);
        method2ForBaştanBaşla(str);
        method3WhileSubstring(str);
        method4StrBuilder(str);
        method5StrBuffer(str);
        method6StringArrayVeCharArray(str);
        method7ByteArrayVeSwap(str);
        method8ArrayList(str);
        method9Recursion(str);
        method10Stack(str);
        method11Lambda(str);
        method12UnicodeRLO(str);
    }

    private static void method1ForSondanBaşla(String str) {
        String rvrs1="";
        String rvrs2="";
        for(int i=str.length()-1; i>=0; i--) {
            rvrs1 += str.charAt(i);
            rvrs2 += str.substring(i, i+1);
        }
        System.out.println("Son indexten başlayarak charAt ve For Loop ile: "+rvrs1);
        System.out.println("Son indexten başlayarak substring ve For Loop ile: "+rvrs2);
    }

    private static void method2ForBaştanBaşla(String str) {
        String rvrs1="";
        String rvrs2="";
        for(int i=0; i<str.length(); i++) {
            rvrs1 = str.charAt(i)+rvrs1;
            rvrs2 = str.substring(i, i+1)+rvrs2;
        }
        System.out.println("İlk indexten başlayarak charAt ve For Loop ile: "+rvrs1);
        System.out.println("İlk indexten başlayarak substring ve For Loop ile: "+rvrs2);
    }

    private static void method3WhileSubstring(String str) {
        String reverse="";
        while (str.length() > 0) {
            reverse += str.charAt(str.length()-1);
            str = str.substring(0, str.length()-1);
        }
        System.out.println("while + substring ile: "+reverse);
    }

    private static void method4StrBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder ile: "+sb.reverse());
    }

    private static void method5StrBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println("StringBuffer ile: "+sb.reverse());
    }

    private static void method6StringArrayVeCharArray(String str) {
        String[] strArray = str.split("");
        char[] charArr = str.toCharArray();

        System.out.print("String Array ile: ");
        for (int i = strArray.length-1; i >=0 ; i--) {
            System.out.print(strArray[i]);
        }
        System.out.println();//dummy

        System.out.print("Char Array ile: ");
        for (int i = charArr.length-1; i >=0 ; i--) {
            System.out.print(charArr[i]);
        }
        System.out.println();//dummy
    }

    private static void method7ByteArrayVeSwap(String str){
        byte[] bytes = str.getBytes();
        System.out.println("Stringimizin ne hale geldiğini görelim "+Arrays.toString(bytes));//Stringimizin ne hale geldiğini görmek için yazdıralım.

        // start from the two endpoints `l` and `h` of the given string
        // and increment `l` and decrement `h` at each iteration of the loop
        // until two endpoints intersect (l >= h)
        for (int l = 0, h = str.length() - 1; l < h; l++, h--)
        {
            // swap values at `l` and `h`
            byte temp = bytes[l];
            bytes[l] = bytes[h];
            bytes[h] = temp;
        }
        // convert byte array back into a string
        System.out.println("Byte Array ile "+new String(bytes));
    }
    private static void method8ArrayList(String str) {
        ArrayList<String> list = new ArrayList<String>(List.of(str.split("")));
        Collections.reverse(list);
        //System.out.println("Arraylist ile: "+list);

        String son []=list.toArray(new String[0]);
        System.out.println("Arraylist ile: "+String.join("", son));//String arraylerde String.join komutu elemanlarla istediğimiz gibi oynamamızı sağlar.
    }

    private static void method9Recursion(String str) {
        if (!str.isEmpty()) {
            System.out.print(str.charAt(str.length()-1));
            method9Recursion(str.substring(0, str.length()-1));
        }else System.out.println();
    }

    private static void method10Stack(String str) {// Method to reverse a string in Java using a stack and character array
        Stack<Character> stack = new Stack<Character>();// create an empty stack of characters
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {// push every character of the given string into the stack
            stack.push(ch[i]);
        }
        int i = 0;
        while (!stack.isEmpty()) {// pop characters from the stack until it is empty
            ch[i++] = stack.pop();// assign each popped character back to the character array
        }
        System.out.println("Stack ile: "+String.copyValueOf(ch));
        System.out.println("Stack ile: "+new String (ch));
    }

    private static void method11Lambda(String str){
        ArrayList<String> list2 = new ArrayList<String>(List.of(str.split("")));
        System.out.println("Lambda ile: "+str.chars().mapToObj(c -> (char) c).reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1));
        System.out.println("Lambda ile: "+str.chars().mapToObj(ch -> Character.toString(ch)).reduce("", (s, ch) -> ch + s));
        System.out.println("Lambda ile: "+str.chars().mapToObj(Character::toString).reduce("", (s, ch) -> ch + s));
        System.out.println("Lambda ile: "+list2.stream().reduce("", (s, ch) -> ch + s));
        System.out.println("Lambda ile: "+Stream.of(str).map(t -> t.split("")).flatMap(Arrays::stream).reduce("", (s, ch) -> ch + s));
        System.out.println("Lambda ile: "+Stream.of(str).map(t -> new StringBuilder(t).reverse()).collect(Collectors.joining()));
    }
    public static void method12UnicodeRLO(String str) {
        System.out.println("Unicode Right-to-Left Override ile: "+"\u202E" + str);
    }
}
