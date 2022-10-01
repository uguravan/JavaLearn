package UgurJava.j09_SwitchStatement.switchCaseTasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {
        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi
        double toplamTutar, FrankfurtKm=60, KölnKm=80, KmBirimFiyat=0.25, paraustu, odeme;
        byte kisi;

        switch (hedef) {
            case "FRANKFURT":
                System.out.println("Rota = Frankfurt \nFrankfurt 15 Euro");
                toplamTutar = FrankfurtKm * KmBirimFiyat;
                System.out.print("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   ");
                kisi = scan.nextByte();
                switch (kisi) {
                    case 1:
                        System.out.println("Frankfurt  - 1 Kişilik");
                        System.out.println("Toplam Tutar " + toplamTutar);
                        System.out.print("Ödeme Yaptığınız miktarı giriniz ");
                        odeme = scan.nextDouble();
                        if (odeme >= toplamTutar) {
                            paraustu = (odeme - toplamTutar);
                            System.out.println("Paraustu: " + paraustu);
                        } else System.out.println((toplamTutar - odeme) + " Euro kadar eksik ödeme yaptınız. :( ");
                        break;
                    case 2:
                        toplamTutar *= 2;
                        System.out.println("Frankfurt  - 2 Kişilik");
                        System.out.println("Toplam Tutar " + toplamTutar);
                        System.out.print("Ödeme Yaptığınız miktarı giriniz ");
                        odeme = scan.nextDouble();
                        if (odeme >= toplamTutar) {
                            paraustu = (odeme - toplamTutar);
                            System.out.println("Paraustu: " + paraustu);
                        } else System.out.println((toplamTutar - odeme) + " Euro kadar eksik ödeme yaptınız. :( ");
                        break;
                    default:
                        System.out.println("Hatalı Giriş Yaptınız");
                        break;
                }
                break;
            case "KÖLN":
                System.out.println("Rota = Köln \nKöln 20 Euro");
                toplamTutar = KölnKm * KmBirimFiyat;
                System.out.print("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   ");
                kisi = scan.nextByte();
                switch (kisi) {
                    case 1:
                        System.out.println("Köln  - 1 Kişilik");
                        System.out.println("Toplam Tutar " + toplamTutar);
                        System.out.print("Ödeme Yaptığınız miktarı giriniz ");
                        odeme = scan.nextDouble();
                        if (odeme >= toplamTutar) {
                            paraustu = (odeme - toplamTutar);
                            System.out.println("Paraustu: " + paraustu);
                        } else System.out.println((toplamTutar - odeme) + " Euro kadar eksik ödeme yaptınız. :( ");
                        break;
                    case 2:
                        toplamTutar *= 2;
                        System.out.println("Köln  - 2 Kişilik");
                        System.out.println("Toplam Tutar " + toplamTutar);
                        System.out.print("Ödeme Yaptığınız miktarı giriniz ");
                        odeme = scan.nextDouble();
                        if (odeme >= toplamTutar) {
                            paraustu = (odeme - toplamTutar);
                            System.out.println("Paraustu: " + paraustu);
                        } else System.out.println((toplamTutar - odeme) + " Euro kadar eksik ödeme yaptınız. :( ");
                        break;
                    default:
                        System.out.println("Hatalı Giriş Yaptınız");
                        break;
                }
                break;
            default: System.out.println("Hatalı Giriş Yaptınız"); break;
        }
    }
}
