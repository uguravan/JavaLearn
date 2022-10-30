package UgurJava.Homeworks.GarryHoca25_10;

public class Task04 {
/*
Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
     */
public static void main(String[] args) {
    int[][] series= {{1,2,3}, {4,5}, {6}};

    int multiLast=1;
    for (int i=0; i<series.length; i++) {
        multiLast*=series[i][series[i].length-1];
    }
    System.out.println("multi dimensional array’in ic array’lerindeki son elemanlarin carpimi= "+multiLast);
}
}
