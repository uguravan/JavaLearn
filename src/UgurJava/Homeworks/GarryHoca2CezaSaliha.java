package UgurJava.Homeworks;

import java.util.Scanner;

public class GarryHoca2CezaSaliha {
    /*
     * Kulanicidan aracinin hizini aliniz Trafik cezasinin degerini hesaplayin. 45
     * hiz siniridir. Eger hiziniz 55-775 arasinda ise: Ceza 100 $'dir.
     *
     * Eger hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
     *
     * Eger hiziniz 85 -94 arasinda ise: Ceza 320 $'dir.
     *
     * Eger hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
     *
     * ve ayrica, Eger sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
     *
     * Örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
     * -----------------------------------------
     * Örn;
     * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
     * true;
     * sonuç 320 olmalidir.
     * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
     * false;
     * sonuç 300 olmalidir.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hızınızı giriniz : ");
        int currentSpeed = scan.nextInt();
        System.out.println("ehliyetiniz var mı ? Varsa true, yoksa false giriniz.");
        boolean isDriverLicenceAvailable = scan.nextBoolean();
        int ceza=0;
        if (currentSpeed > 94) ceza = 500;
        else if (currentSpeed >= 85) ceza = 320;
        else if (currentSpeed >= 75) ceza = 150;
        else if (currentSpeed >= 55) ceza = 100;
        if (isDriverLicenceAvailable == false) ceza += 200;
        System.out.println("Cezanız = " + ceza+"$");
    }
}
