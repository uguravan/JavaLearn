package UgurJava.j26_Inheritance.Task02;

public class SubClass extends SuperClass{
    int num  = 10;

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.my_method();
    }

    @Override
    public void göster() {
        System.out.println("Bu method Sub classın görüntülenme methodudur");
    }
    private void my_method() {
        göster();
        super.göster();
        System.out.println(num);
        System.out.println(super.num);
    }
}
