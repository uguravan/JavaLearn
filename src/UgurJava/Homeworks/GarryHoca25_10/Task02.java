package UgurJava.Homeworks.GarryHoca25_10;

public class Task02 {
/*
Soru 2) Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
     */
public static void main(String[] args) {
    int[] num= {5,4,3,2,1};
    int product=1;
    for(int i : num) product *= i;
    System.out.println("product= "+product);
}
}
