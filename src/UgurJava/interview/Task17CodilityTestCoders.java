package UgurJava.interview;

public class Task17CodilityTestCoders {
    /*
17 -->> Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a seperate line.
However, any number divisible by 2,3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5,
it should be replaced by a concatenation of the respective words Codility, Test or Coders in this given order.
For example : numbers divisible by both 2 and 3 should be replaced by CodilityTest and
numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
*/
    public static void main(String[] args) {
        int given =30;
        method235(given);
    }
    public static void method235(int given) {
        for(int i = 1; i <=given; i++){
            if(i%(2*3*5)==0){
                System.out.println("CodilityTestCoders ");
            }else if(i%(2*3)==0){
                System.out.println("CodilityTest ");
            }else if(i%3!=0 && i%(2*5)==0){
                System.out.println("CodilityCoders ");
            }else if(i%2!=0 && i%(3*5)==0){
                System.out.println("TestCoders ");
            }else System.out.println(i+" ");
        }
    }
}
