package UgurJava.Homeworks.GarryHoca25_10;

public class Task01 {
    /*
    Soru 1) iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz.
         */
    public static void main(String[] args) {
        String[] names1 = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String[] names2 = {"musty", "koray", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};

        System.out.print("Ortak elemanlar: ");
        int counter=0;
        for (String i:names1) {
            for (String j : names2) {
                if (i.equalsIgnoreCase(j)) {
                    System.out.print(i + " ");
                    counter++;
                }
            }
        }
        if (counter == 0) System.out.println("Ortak eleman yok ");
    }
}
