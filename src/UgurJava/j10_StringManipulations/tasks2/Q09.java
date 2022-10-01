package UgurJava.j10_StringManipulations.tasks2;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = input.nextLine();
        metin = metin.trim();

        if (metin.length()%2 == 0) {
            System.out.println("Girdiğiniz metnin ilk yarısı: "+metin.substring(0,metin.length()/2));
        }else System.out.println("Girdiğiniz metnin karakter uzunlu tek sayı olduğu için yarısını yazdıramıyoruz, kusura bakmayın. ");
        input.close();
    }
}
