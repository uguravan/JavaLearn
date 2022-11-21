package UgurJava.Denemeler;


import java.util.Scanner;

public class dene1 {
       public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.print("lütfen password giriniz: ");
        String pass= scan.nextLine();
        System.out.println(pass);
        System.out.println();//dummy password
        System.out.println("merhabalar");*/
        double age= 50.9;
        int a=5;
        int b=4;

        yaşbulan((int) age);
        boolean flag= false;

        if(flag){
            System.out.println("flag = true");
        }else System.out.println("flag falsemuş");

        System.out.println(flag ? "ok": "not ok");
        String name = a==b ? "Ahmet" : (a<b ? "Mehmet" : (a>10 ? "Kevser" : "Oğuzhan"));
        System.out.println(name);
    }
    public static void yaşbulan(int age){
        age+=5;
        System.out.println(age);
    }

}
