package UgurJava.Homeworks;

import java.util.ArrayList;

public class Task03_Student {
/*
	 /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
    String name;
    byte maxCredit=10;

    ArrayList<Task03_Lesson> dersler = new ArrayList<>();

    public Task03_Student(String name, byte maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
    }
}