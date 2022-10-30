package UgurJava.Homeworks;

public class Task01_RectangleRunner {
/*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
public static void main(String[] args) {
    Task01_Rectangle ucgen1 = new Task01_Rectangle(10, 10);
    System.out.println("cevre= "+ucgen1.cevre());
    System.out.println("alan= "+ucgen1.alan());

    Task01_Rectangle ucgen2 = new Task01_Rectangle(20, 10);
    System.out.println("cevre= "+ucgen2.cevre());
    System.out.println("alan= "+ucgen2.alan());

    }
}
