package Murat;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kimlik numaranızı giriniz :");
        long tcNo = input.nextLong();
        long ilkHane = tcNo / 10000000000l;
        boolean uzunlukDogruMu = ("" + tcNo).length() == 11;
        int sonRakam = (int) (tcNo % 2);
        if (ilkHane != 0 && uzunlukDogruMu == true && sonRakam % 2 == 0) {
            System.out.println("tebrikler dogru numara");
        }
        if (ilkHane == 0) {
            System.out.println("ilk Hane 0 olamaz");
        }
        if (uzunlukDogruMu == false) {
            System.out.println("TC No 11 haneden oluşmalıdır");
        }
        if (sonRakam % 2 != 0) {
            System.out.println("son rakam çift olmalıdır");
        }
    }
}