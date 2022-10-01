package UgurJava.Homeworks;

public class Task01 {
    /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp
	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */
    //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdırınız
        // Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.
        //Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız
    //Soru-4 : "Basari" gayrete
    // 'asiktir'  yazdırınız sonraki "Clarusway ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.
    public static void main(String[] args) {
        System.out.println("\"Hello \", \"World  \\ /\"");//Soru1
        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");//Soru2
        System.out.println("\"Java\" ile hayat cok \'afilli\'");//Soru3
        System.out.println("\"Basari\" gayrete\n\'asiktir\'\n\n\n\t\"Clarusway ile java cok kolay ...\"");//Soru4
        System.out.println("Uğur A\n178\n94\nSatranç Futbol");//Task02
    }
}
