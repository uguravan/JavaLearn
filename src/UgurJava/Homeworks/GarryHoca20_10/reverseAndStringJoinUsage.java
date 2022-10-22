package UgurJava.Homeworks.GarryHoca20_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class reverseAndStringJoinUsage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz.");
        String kelime = scan.nextLine();


        String myArray[] = kelime.split("");
        System.out.println(Arrays.toString(myArray));


        List<String> myList = Arrays.asList(myArray);
        System.out.println(myList);


        Collections.reverse(myList);
        System.out.println(myList);

        String son []=myList.toArray(new String[0]);
        //String joined = String.join("", son);
        //System.out.println(joined);
        System.out.println(String.join("", son));
        scan.close();

/*        StringBuffer sb = new StringBuffer();
        for (String s : myList) {
            sb.append(s);
        }
        String str = sb.toString();
        System.out.println(str);*/
    }
}
