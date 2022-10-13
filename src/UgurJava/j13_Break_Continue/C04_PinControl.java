package UgurJava.j13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = "javaCAN";
        int girişhakkı=3;

        while (girişhakkı>0){
            System.out.print("Pini giriniz: ");
            String pin = scanner.nextLine();
            if (pin.equals(data)){
                System.out.print("Pin doğru");
                break;
            }
            System.out.print(girişhakkı-1+" hakkınız kaldı");
            girişhakkı--;
        }
        System.out.println((girişhakkı==0)? "giriş hakkınız kalmadı, bir dahaki sefere artık. " : "");
    }
}
