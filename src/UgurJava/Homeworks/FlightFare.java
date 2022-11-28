package UgurJava.Homeworks;
    /*
    ----------------------------------------  ÖDEV  ----------------------------------------
    * A şehrinden uçmak isteyen bir kişi B şehrine 500 KM, C şehrine 700 KM, D şehrine 900 KM mesafededir.
    * KM Birim Fiyatı: 0.10$
    * 12 yaşından küçükse toplam fiyata %50 indirim uygulanacaktır.
    * 12 - 24 yaş arasındaysa %10 indirim uygulanacaktır.
    * 65 yaşından büyükse %30 indirim uygulanacaktır.
    * Gidiş - Dönüş bilet alınırsa yaş indirimlerinden hariç %20 indirim uygulanacaktır.
    * Bu koşullara göre yolcudan gideceği mesafeyi isteyip, uçak bilet ücretini hesaplayan kodu yazınız.
    */
import java.util.Scanner;

public class FlightFare {
    static Scanner scan = new Scanner(System.in);
    static double tripTypeDisc;
    static double ageDisc;
    static double cityBill;
    public static void main(String[] args) {
        System.out.println("Flight Price : " + (city() * ageDiscount() * tripType())+" $");
        scan.close();
    }

    public static double city() {
        System.out.print("Please choose your destination: B or C or D ");
        char city = scan.next().trim().toUpperCase().charAt(0);

        switch (city) {
            case 'B': cityBill=500*0.1; break;
            case 'C': cityBill=700*0.1; break;
            case 'D': cityBill=900*0.1; break;
            default: System.out.println("Please enter your information appropriately."); city();
        }
        return cityBill;
    }

    public static double ageDiscount() {
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        if (age>=0) {
            ageDisc = (age > 65 ? 0.7 : (age > 24 ? 1 : (age > 12 ? 0.9 : 0.5)));
        } else {System.out.println("Please enter your information appropriately."); ageDiscount();}
        return ageDisc;
    }

    public static double tripType() {
        System.out.print("Please choose your flight type: Round-trip<1> or One-way<2> ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: tripTypeDisc = 2*0.8; break;
            case 2: tripTypeDisc = 1; break;
            default:
                System.out.println("enter your information appropriately. ");
                tripType();
                break;
        }
        return tripTypeDisc;
    }
}
