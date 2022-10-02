package UgurJava.Homeworks.GarryHoca29_09;

public class Odevl9 {
    /*
            9- 		String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    String str1 = “$13.99”
    String str2 = “$10.55”
    İpucu :)) : Double.parseDouble() methodunu kullanabilirsiniz.*/
    public static void main(String[] args) {
        String str1 = "$13.99";
        String str2 = "$10.55";
        double d1 = Double.parseDouble(str1.substring(1));
        double d2 = Double.parseDouble(str2.substring(1));
        double sum = d1 + d2;
        System.out.println("sum = " + sum);
    }

}
