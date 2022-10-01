package UgurJava.j08_ifStatement_TernaryOperator.Task_NestedIf;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner input= new Scanner(System.in);
        System.out.print("boyunuzu kaç m : ");
        double boy= input.nextDouble();

        System.out.print("kg cinsinden ağırlığınızı yazınız : ");
        double kilo= input.nextInt();
        double vke= kilo/(boy*boy);
        if (vke>30) {
                System.out.println(" Obez grubundasiniz. ");
        } else if (vke>25) {
                System.out.println(" Sisman kategorisindesiniz. ");
        } else if (vke>20) {
                System.out.println(" Normal sinirlardasiniz. ");
        } else System.out.println(" oldukca zayifsiniz ");
    }
}
