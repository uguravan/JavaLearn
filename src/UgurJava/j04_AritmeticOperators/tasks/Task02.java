package UgurJava.j04_AritmeticOperators.tasks;

public class Task02 {
	public static void main(String[] args) {
		/*
		 Write a program that prints multiplication table for 1.
		 Do not use any loop.
		    1x1=1
		    1x2=2
			1x3=3
			1x4=4
			1x5=5
			1x6=6
			1x7=7	
			1x8=8
			1x9=9
			1x10=10
		 */
		int num = 1;
		System.out.println("multiplication table for 1");
		System.out.println("1*"+num+"="+(1*num++));//1x1=1, num=2
		System.out.println("1x"+num+"="+(1*num++));//1x2=2, num=3
		System.out.println("1x"+num+"="+(1*num++));//1x3=3, num=4
		System.out.println("1x"+num+"="+(1*num++));
		System.out.println("1x"+num+"="+(1*num++));
		System.out.println("1x"+num+"="+(1*num++));
		System.out.println("1x"+num+"="+(1*num++));
		System.out.println("1x"+num+"="+(1*num++));
		System.out.println("1x"+num+"="+(1*num++));
		System.out.println("1x"+num+"="+(1*num));
	}
}
