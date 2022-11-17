package UgurJava.j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1 = new Isci();
        mrb1.maasHesapla();
        mrb1.maasBilgisi();
        mrb1.sigorta();
        mrb1.name= "Ebubekir güzel insan ";
        System.out.println("mrb1 name: "+mrb1.name);

        IdariPersonel idari1 = new IdariPersonel();
        idari1.maasHesapla();
        idari1.maasBilgisi();
        idari1.sigorta();
        idari1.name= "Dilek hanım";
        System.out.println("idari1 name: "+idari1.name);
    }
}
