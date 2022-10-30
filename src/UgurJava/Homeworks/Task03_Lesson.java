package UgurJava.Homeworks;

public class Task03_Lesson {
/*
	 /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */
    String lessonName;
    byte credit;

    public Task03_Lesson(String lessonName, byte credit) {
        this.lessonName = lessonName;
        this.credit = credit;
    }
}
