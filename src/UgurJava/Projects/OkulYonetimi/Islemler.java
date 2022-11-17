package UgurJava.Projects.OkulYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {
	Scanner scan = new Scanner(System.in);
	ArrayList<Ogrenci> listOgrenci = new ArrayList<>();
	ArrayList<Ogretmen> listOgretmen = new ArrayList<>();

	public void panelAc() {
		System.out.print("====================\nÖğrenci - Öğretmen Paneli\n============\n[1] - Öğrenci İş\n[2] - Öğretmen İşl.\n[Q] çıkış\nSeçiniz : ");
		char secim = scan.next().charAt(0);
		switch(secim) {
		case '1': ogrenciİslemleri(); break;
		case '2': ogretmenİslemleri(); break;
		case 'Q': System.out.println("Çıkış işleminiz yapıldı"); break;
		default : System.out.println("Yanlış işlem yaptınız"); panelAc();
		}
	}
	public void ogrenciİslemleri() {
		System.out.println("=======İşlemler======\n[1] - Ekle\n[2] - Arama\n[3] - Listeleme\n[4] - Silme\n[5] - Ana menü\n[Q]- Çıkış");
		char secim = scan.next().charAt(0);
		switch(secim) {
		case '1' : ogrenciEkle(); panelAc();break;
		case '2' : ogrenciAra(); panelAc();break;
		case '3' : ogrenciListele();panelAc(); break;
		case '4' : ogrenciSilme(); panelAc();break;
		case '5' : panelAc(); break;
		case 'Q' : System.out.println("Çıkış işleminiz yapıldı "); break;
		default : System.out.println("Yanlış işlemi yaptınız "); ogrenciİslemleri(); break;
		}
		
	}
	private void ogrenciAra() {
		System.out.print("Aramak istediğiniz öğrencinin kimlik No'sunu giriniz : ");
		String kimlikNo = scan.next();
		int sayac = 0;
		for(Ogrenci value : listOgrenci) {
			if(value.tcNo.equals(kimlikNo)) {
				sayac++;
				System.out.println(value.toString());
			}
		}
		System.out.println(sayac==0 ? "Öğrenci bulunamadı" : "Öğrenci bilgileri yazdırıldı");
		
		
	}

	private void ogrenciSilme() {
		System.out.print("Silmek istediğiniz öğrencinin kimlik no'sunu giriniz : ");
		String kimlikNo = scan.next();
		System.out.println(listOgrenci.removeIf( x -> x.tcNo.equals(kimlikNo)) ? "Öğrenci silindi" : "Silinecek öğrenci bulunamadı");
	}

	private void ogrenciListele() {
		System.out.println(listOgrenci.toString());
	}

	private void ogrenciEkle() {
		System.out.print("Öğrencinin adınıSoyadı giriniz : ");
		String ogrAd = scan.next();
		System.out.print("Öğrenci tcNo giriniz : ");
		String tcNo = scan.next();
		System.out.print("Öğrenci yaşını giriniz = ");
		int yas = scan.nextInt();
		System.out.print("Öğrenci no = ");
		int no = scan.nextInt();
		System.out.print("Öğrenci sınıf Bilgisi : ");
		String sinif = scan.next();
		listOgrenci.add(new Ogrenci(ogrAd, tcNo, yas, no, sinif));
	}

	public void ogretmenİslemleri() {
		System.out.println("=======İşlemler======\n[1] - Ekle\n[2] - Arama\n[3] - Listeleme\n[4] - Silme\n[5] - Ana menü\n[Q]- Çıkış");
		char secim = scan.next().charAt(0);
		switch(secim) {
		case '1' : ogretmenEkle(); panelAc();break;
		case '2' : ogretmenArama(); panelAc(); break;
		case '3' : ogretmenListele(); panelAc(); break;
		case '4' : ogretmenSilme(); panelAc(); break;
		case '5' : panelAc(); break;
		case 'Q' : System.out.println("Çıkış işleminiz yapıldı "); break;
		default : System.out.println("Yanlış işlem yaptınız : "); ogretmenİslemleri(); break;
		}
		
}

	private void ogretmenSilme() {
		System.out.print("Silmek istediğiniz öğretmenin kimlik no'sunu giriniz : ");
		String kimlikNo = scan.next();
		System.out.println(listOgretmen.removeIf( x -> x.tcNo.equals(kimlikNo)) ? "Öğretmen silindi" : "Silinecek öğretmen bulunamadı");
	}

	private void ogretmenListele() {
		System.out.println(listOgretmen.toString());
	}

	private void ogretmenArama() {
		System.out.print("Aramak istediğiniz öğretmenin kimlik No'sunu giriniz : ");
		String kimlikNo = scan.next();
		int sayac = 0;
		for(Ogretmen value : listOgretmen) {
			if(value.tcNo.equals(kimlikNo)) {
				sayac++;
				System.out.println(value.toString());
			}
		}
		System.out.println(sayac==0 ? "Öğretmen bulunamadı" : "Öğretmen bilgileri yazdırıldı");
		
	}

	private void ogretmenEkle() {
		System.out.print("Öğretmen adınıSoyadı giriniz : ");
		String ogrAd = scan.next();
		System.out.print("Öğretmen tcNo giriniz : ");
		String tcNo = scan.next();
		System.out.print("Öğretmen yaşını giriniz = ");
		int yas = scan.nextInt();
		System.out.print("Öğretmen Sicil no = ");
		int sicilno = scan.nextInt();
		System.out.print("Öğretmen Bolüm bilgisi : ");
		String bolum = scan.next();
		listOgretmen.add(new Ogretmen(ogrAd, tcNo, yas, bolum, sicilno));
	}
}