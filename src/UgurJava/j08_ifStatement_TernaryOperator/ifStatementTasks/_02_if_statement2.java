package UgurJava.j08_ifStatement_TernaryOperator.ifStatementTasks;

public class _02_if_statement2 {

    public static void main(String[] args) {

        /*İki tane int oluşturun. Birinci (1.) int 26. İkinci (2.) int 35.
          Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
          Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın. */

        //Kodu aşağıya yazınız.
        int int1=26, int2=35;
        if (int1 > int2) {
            System.out.println("int 1 is greater than 2");
        } else if (int1 < int2) System.out.println("int 1 is smaller than 2");
    }
}
