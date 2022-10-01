package UgurJava.j08_ifStatement_TernaryOperator.ifStatementTasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */
        double double1=26.0, double2=35.35;
        if (double1 > double2) {
            System.out.println("double 1 is greater than double 2");
        } else if (double1 < double2) System.out.println("double 1 is smaller than double 2");
    }
}
