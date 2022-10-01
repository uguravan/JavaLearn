package UgurJava.j04_AritmeticOperators.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//5
        x += x;//5+5=10
        --x;//10-1=9
        x = 7 + x;//16
        x *= x;//16*16=256
        x -= 3;//256-3=253

        System.out.println(" x = " + x );// x = 253

        int a = 3;
        double d = 4.5;
        d+=a;//d=4.5+3=7.5
        a+=d;//a=3+7.5=10.5 değil 10 integer olduğu için
        d-=a;//d=7.5-10=-2.5
        a-=d;//a=10--2.5=12.5 değil 12 integer olduğu için
        System.out.println(" d = " + ++d );// d = -1.5 yazar
        System.out.println(" a = " + a-- );// a = 12 yazar ancak bu işlemden sonra a'ya 11 değerini atar.
	}
}
