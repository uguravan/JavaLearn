package UgurJava.j26_Inheritance.Inheritance01;

public class Mammal extends Hayvancık {// Hayvancık dedesinin oğlu - baba
    public Mammal() {
        System.out.println("MAMMAL parametresiz cons çalıştı");
    }
    public void sutBeslenme(){
        System.out.println("bebeleri SUT ile beslenir.");
    }
    public void dogum(){
        System.out.println("yavrusu olur");
    }
}
