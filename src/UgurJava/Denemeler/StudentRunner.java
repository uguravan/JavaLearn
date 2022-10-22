package UgurJava.Denemeler;

public class StudentRunner {
    public static void main(String[] args) {

        StudentFabrika ogrc1 = new StudentFabrika();
        ogrc1.setId(1);//StudentFabrikada classındaki instance variablelar FINAL yapılınca bunlar KIZARACAK
        ogrc1.setName("mahmut ümit avan");//StudentFabrikada classındaki instance variablelar FINAL yapılınca bunlar KIZARACAK
        System.out.println("ogrc1: "+ogrc1);//Student{name='mahmut ümit avan', id=1}

        ogrc1.setId(11);//StudentFabrikada classındaki instance variablelar FINAL yapılınca bunlar KIZARACAK
        ogrc1.setName("mahmut avan");//StudentFabrikada classındaki instance variablelar FINAL yapılınca bunlar KIZARACAK
        System.out.println("ogrc1: "+ogrc1);//Student{name='mahmut avan', id=11}-->ogrc1 MUTABLE, so StudentFabrika class also MUTABLE
    }
}