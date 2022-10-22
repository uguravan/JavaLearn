package UgurJava.Denemeler;

public class StudentFabrika {
    private String name;//public StudentFabrika(String name, int id) cons üretince final yaparsak ancak üretildikten sonra değiştirilemez.
    private int id;

    public StudentFabrika() {

    }
    public StudentFabrika(String name, int id) {//setter conslara ihtiyaç kalmadı
        this.name = name;
        this.id = id;
    }

    public int getId() {//bu classtan üretilmiş objelerin idsini getirmek için
        return id;
    }

    public String getName() {//bu classtan üretilmiş objelerin ismini getirmek için
        return name;
    }

   public void setId(int id) {//bu classtan üretilmiş objelerin idsini değiştirmek için
        this.id = id;
    }

    public void setName(String name) {//bu classtan üretilmiş objelerin ismini değiştirmek için
        this.name = name;
    }

    @Override
    public String toString() {//bu classtan üretilmiş objelerin fieldlarını (instance variables) tek bir komutla yazdırmak için
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
