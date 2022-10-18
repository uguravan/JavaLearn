package UgurJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task04 {
  /*  TASK :

            * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
                 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]*/
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        ArrayList<String > isimler= new ArrayList<>(List.of("Fatih","Gamze","Saliha","Koray","Cüneyt"));
        ArrayList<String > asızisimler= new ArrayList<>();
        ArrayList<String > aolanisimler= new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).toLowerCase().contains("a")) {
                asızisimler.add(isimler.get(i));
            }else aolanisimler.add(isimler.get(i));
        }
    }
}
/*
    ArrayList<String> listIsim = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
    ArrayList<String> aOlmayanlistIsim = new ArrayList<>();//boş list
        for (int i = 0; i < listIsim.size(); i++) {

        if (!listIsim.get(i).toLowerCase().contains("a")) {//listin her bir elelmanı a bulundurmuyorsa
        aOlmayanlistIsim.add(listIsim.get(i));//yeni list' a olmayan eleman eklendi
        }
        }
        System.out.println("aOlmayanlistIsim = " + aOlmayanlistIsim);

        listIsim.clear();//list ısım boşlatılıdı

        listIsim.addAll(aOlmayanlistIsim);

         */