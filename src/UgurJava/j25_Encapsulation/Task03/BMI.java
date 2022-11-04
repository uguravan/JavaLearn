package UgurJava.j25_Encapsulation.Task03;
/*
 Bmı classfields -> name, age, weight,height: encapsulated
getBMI() method -> bmi=weight/(height*height) returb type olmalı
 getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
 runner class obj ile dataları print eden code create ediniz
  */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        double BMI = weight/(height*height);
        return BMI;
    }
    public String getStatus() {
        String status= getBMI()<18.5? "zayıf" : getBMI()<25? "normal" : getBMI()<30? "kilolu" : "obez";
        return status;
    }
}
class Runner {
    public static void main(String[] args) {
        BMI obj1 = new BMI("Uğur", 45, 95, 1.78);
        System.out.println(obj1.getName()+" "+obj1.getStatus()+" BMI: "+obj1.getBMI());
    }
}