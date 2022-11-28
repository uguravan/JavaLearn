package UgurJava.j99_LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C10_Object {
    /*
    TASK :
    fields --> Universite (String)
               bolum (String)
               ogrcSayisi (int)
               notOrt (int)
               olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
     */
    public static void main(String[] args) {
        Universite u01 = new Universite("Bogazici", "Matematik", 571, 73);
        Universite u02 = new Universite("Istanbul", "Matematik", 622, 77);
        Universite u03 = new Universite("Marmara", "Hukuk", 1453, 52);
        Universite u04 = new Universite("Itu", "uçak muh.", 333, 63);
        Universite u05 = new Universite("Yıldız Teknik", "Gemi ", 216, 55);

        List<Universite> unv=new ArrayList<>(Arrays.asList(u01,u02,u03, u04,u05));
        System.out.println("Task01 : "+notOrt74Byk(unv));//false
        System.out.println("Task 02: "+task02(unv));
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        System.out.println("\n   ***   ");
        System.out.println(unv.stream().allMatch(t -> t.getOgrcSayisi() >= 110)); //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
        System.out.println(unv.stream().anyMatch(t -> t.getBolum().toLowerCase().contains("mat")));
        task04(unv);
        System.out.println();
        task05(unv);
        System.out.println();
        task06(unv);
        System.out.println();
        task07(unv);
        System.out.println();
        task08(unv);
        System.out.println();
        task09(unv);
        System.out.println();
        task10(unv);
        System.out.println();
        task11(unv);

    }//main sonu


    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static  boolean notOrt74Byk(  List<Universite>unv){

        return unv.
                stream().
                allMatch(t->t.getNotOrt()>74);
    }

        //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
    public static boolean task02(List<Universite> unv) {
            return unv.stream().allMatch(t-> t.getOgrcSayisi()>=110);

    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static void task04(List<Universite> unv) {
        unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).collect(Collectors.toList()).forEach(t->System.out.print(t.getUniversite()+" "));
    }
    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static void task05(List<Universite> unv) {
        unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).collect(Collectors.toList()).forEach(t->System.out.print(t.getUniversite()+" "));
    }
    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static void task06(List<Universite> unv) {
        unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1).collect(Collectors.toList()).forEach(t->System.out.print(t.getUniversite()+" "));
    }
    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static void task07(List<Universite> unv) {
        System.out.println(unv.stream().filter(t -> t.getNotOrt() > 63).mapToInt(t -> t.getOgrcSayisi()).sum());
    }
    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static void task08(List<Universite> unv) {
        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi() > 333).mapToDouble(t -> t.getNotOrt()).average().getAsDouble());
    }
    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    public static void task09(List<Universite> unv) {
        System.out.println(unv.stream().filter(t -> t.getBolum().equalsIgnoreCase("matematik")).count());
    }

    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static void task10(List<Universite> unv) {
        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi()>571).mapToInt(t->t.getNotOrt()).reduce(Integer.MIN_VALUE, Math::max));
    }

    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static void task11(List<Universite> unv) {
        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi()<1071).mapToInt(t->t.getNotOrt()).reduce(Integer.MAX_VALUE, Math::min));
    }

}
