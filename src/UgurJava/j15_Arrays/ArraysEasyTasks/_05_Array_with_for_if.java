package UgurJava.j15_Arrays.ArraysEasyTasks;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
        int numArr[]= {5,6,8,12,14,19};
        int sum=0;
        for (int i=0; i<numArr.length; i++){
            if (numArr[i]%2==0){
                sum+=numArr[i];
            }else sum-=numArr[i];
        }
        System.out.println("toplam = " + sum);
    }
}
