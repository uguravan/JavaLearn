package UgurJava.Denemeler;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReversingString {
    public static void main(String[] args) {
        String str = "javaCAN & JAVATAR";
        method1ForSondanBaşla(str);
        method2ForBaştanBaşla(str);
        method3WhileSubstring(str);
        method4StringBuilder(str);
        method5StringBuffer(str);
        method6StringArray(str);
        method7CharArray(str);
        method8ByteArrayveSwap(str);
        method9ArrayList(str);
        method10Recursion(str);
        method11Stack(str);
        method12Lambda(str);
        method13UnicodeRLO(str);

    }

    private static void method13UnicodeRLO(String str) {
        System.out.println("Unicode Right-To-Left Override ile "+"\u202E"+str);
    }

    private static void method12Lambda(String str) {
        System.out.println("Lambda ile "+str.chars().mapToObj(c -> Character.toString(c)).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile "+str.chars().mapToObj(Character::toString).reduce("", (s, c) -> c + s));
        ArrayList<String> list2= new ArrayList<String>(List.of(str.split("")));
        System.out.println("Lambda ile "+list2.stream().reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile "+Stream.of(str).map(t -> new StringBuilder(t).reverse()).collect(Collectors.joining()));
    }

    private static void method11Stack(String str) {
        Stack<Character> stack = new Stack<Character>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            stack.push(ch[i]);
        }
        int i=0;
        System.out.print("Stack ile: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();//
    }

    private static void method10Recursion(String str) {
        if (!str.isEmpty()) {
            System.out.print(str.charAt(str.length() - 1));
            method10Recursion(str.substring(0, str.length() - 1));
        }else System.out.println();//dummy
    }

    private static void method9ArrayList(String str) {
        ArrayList<String> list= new ArrayList<String>(List.of(str.split("")));
        Collections.reverse(list);
        System.out.println("ArrayList ile "+list);

        String[] array= list.toArray(new String[0]);
        System.out.println("ArrayList ile "+String.join("", array));
        System.out.println("ArrayList ile "+String.join("!", array));
    }

    private static void method8ByteArrayveSwap(String str) {
        byte[] bytes = str.getBytes();
        System.out.println("Stringimizin son hali: "+Arrays.toString(bytes));

        for(int i=0, j=str.length()-1; i<j; i++, j--) {
            byte temp = bytes[i];
            bytes[i] = bytes[j];
            bytes[j] = temp;
        }
        System.out.println("Bite Array ve Swap ile: "+new String(bytes));
    }

    private static void method7CharArray(String str) {
        char[] charArray = str.toCharArray();
        System.out.print("Char Array ile: ");
        for(int i=charArray.length-1; i>=0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();//dummy
    }

    private static void method6StringArray(String str) {
        String[] strArr = str.split("");
        System.out.print("String Array ile: ");
        for(int i=strArr.length-1; i>=0; i--) {
            System.out.print(strArr[i]);
        }
        System.out.println();//dummy
    }

    private static void method5StringBuffer(String str) {
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("StringBuffer ile: "+buffer.reverse());
    }

    private static void method4StringBuilder(String str) {
        StringBuilder builder = new StringBuilder(str);
        System.out.println("StringBuilder ile: "+builder.reverse());
    }

    private static void method3WhileSubstring(String str) {
        System.out.print("While charAt ve substring ile: ");
        while (str.length() > 0) {
            System.out.print(str.charAt(str.length() - 1));
            str = str.substring(0, str.length() - 1);
        }
        System.out.println();//dummy
    }

    private static void method2ForBaştanBaşla(String str) {
        String rvrs1="";
        String rvrs2="";

        for(int i=0; i<str.length(); i++) {
            rvrs1 = str.charAt(i)+rvrs1;
        }
        System.out.println("ilk indexten başlayarak For Loop ve charAt ile: "+rvrs1);//dummy

        for(int i= str.length()-1; i>=0; i--) {
            rvrs2 = str.substring(i, i+1)+rvrs2;
        }
        System.out.println("ilk indexten başlayarak For Loop ve substring ile: "+rvrs2);//dummy
    }

    private static void method1ForSondanBaşla(String str) {
        System.out.print("Son indexten başlayarak For Loop charAt ile: ");
        for(int i= str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();//dummy

        System.out.print("Son indexten başlayarak For Loop substring ile: ");
        for(int i= str.length()-1; i>=0; i--) {
            System.out.print(str.substring(i, i+1));
        }
        System.out.println();//dummy
    }
}
