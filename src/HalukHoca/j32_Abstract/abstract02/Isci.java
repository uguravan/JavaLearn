package HalukHoca.j32_Abstract.abstract02;

public class Isci extends Personel{//abs Personel parent Clas'a extends->concrete child Isci class
    @Override//mecbur implemen edilemli
    public void maasHesapla() {//Personel parent class'dan override abs meth.
        System.out.println("agam marabalara en çok yeymiye 499 gayme verilir..");
    }

    @Override//mecbur implemen edilemli
    public void maasBilgisi() {//Personel parent class'dan override abs meth.
        System.out.println("Agam marabalar cay-cüğara hariç günde 8 saat kürek mahkumu :(");

    }
}
