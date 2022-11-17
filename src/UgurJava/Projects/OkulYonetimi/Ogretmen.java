package UgurJava.Projects.OkulYonetimi;
import java.util.ArrayList;

public class Ogretmen extends Kisi {
	String bolum;
	int sicilNo;
	
	public Ogretmen(String adSoyad, String tcNo, int yas , String bolum , int sicilNo) {
		super(adSoyad, tcNo, yas);
		this.bolum = bolum;
		this.sicilNo = sicilNo;
	}

	@Override
	public String toString() {
		return "Ogretmen [bolum=" + bolum + ", adSoyad=" + adSoyad + ", tcNo=" + tcNo + ", yas=" + yas + "]\n";
	}
	
}
