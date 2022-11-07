package UgurJava.Denemeler;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class MathRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input an integer to specify the size of list which will include the random numbers between 1 to 100: ");
        int size= scan.nextInt();
        ArrayList<Integer> randomArr = new ArrayList<>();

        for(int i=0; i<size; i++){//1-100 arasında random integer üretilip arrayliste ekleniyor.
            randomArr.add((int)(Math.random()*100+1));//Sıfır çift sayıdır. Random sayılar arasında SIFIR olmaması için +1 eklenmiştir.
        }
        System.out.println(randomArr);
        System.out.println("Product of even numbers in the list: "+evenNumPro(randomArr));
    }

    private static int evenNumPro(ArrayList<Integer> randomArr) {
        int product=1;
        int counter=0;
        for(int value : randomArr){
            if(value%2==0){
                product *= value;
                counter++;
            }
        }
        if(counter==0){
            System.out.println("There is no even number in your list :(");
            product = 0;
        }
        return product;
    }
}
