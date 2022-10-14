package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {
        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
        String para= "$12 $23 $10 $2 $5 $2";
        String money[]= para.replace("$","").split(" ");
        int sum=0;
        for (int i=0; i<money.length; i++){
            sum+=Integer.parseInt(money[i]);
        }
        System.out.println("sum = "+sum+"$");
    }
}