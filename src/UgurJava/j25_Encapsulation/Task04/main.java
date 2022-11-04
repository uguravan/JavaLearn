package UgurJava.j25_Encapsulation.Task04;
/*
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ad giriniz: ");
        String name = scan.nextLine();
        System.out.print("Yaş giriniz: ");
        int age = scan.nextInt();
        Student s1= new Student(name, age);
    }
}
class Student {//Student Class-> inner Class
    // String nameve int age  variables encapsulated ediniz.
    private String name;
    private int age;

    public Student(String name, int age) {//full p cons.
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}