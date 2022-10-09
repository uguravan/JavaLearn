package UgurJava.j12_Loops.L02_WhileLoop.Tasks;

public class Task04_4ve6yaTambolunebilen {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
	int adet=0;
	int sayi=100;

	while(sayi<1000){
		if(sayi%4==0 && sayi%6==0){
			System.out.print(sayi+" ");
			adet++;
		}
		sayi++;
	}
	System.out.println();
	System.out.println("3 basamakli 4 ve 6 ya tam bolunebilen "+adet+" tane tam sayi vardır.");
	}

}
