package UgurJava.Homeworks.GarryHoca29_09;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Odevl5 {
    /*
        5- 		 * Asagidaki String degiskenini kullanarak konsolda A L i yazdiriniz.
		 * String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";*/
    public static void main(String[] args) {
        String harfDepo= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(harfDepo.charAt(harfDepo.indexOf('A'))+" "+harfDepo.charAt(harfDepo.indexOf('L'))+" "+harfDepo.toLowerCase().charAt(harfDepo.indexOf('I')));

    }

}
