package UgurJava.j26_Inheritance.Inheritance02;

public class Kedi extends Mammal {//Mammal child'ı - torun
    /*
    Chil class obj olmadan parent class variable ve method'lara ulaşabilir
     */
    public Kedi() {
        super();
        System.out.println("Kedi parametresiz cons çalıştı");
    }
    public Kedi(String str) {//p.li cons
        this();
        System.out.println(super.c);
        System.out.println("Kedi parametresiz cons çalıştı");
    }
    public void cırmala(){
        System.out.println("kedi fena cırmalar...");
    }
    int c=2;
    int d=5;

    @Override
    public void mC() {//Mammal parentden ezen method
        System.out.println("mC -> Kedi class meth call.");;
    }
}// Class sonu
