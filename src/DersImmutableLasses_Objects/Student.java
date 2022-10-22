package DersImmutableLasses_Objects;

final public class Student {
    final private String name;
    final private int id;

    public String getName() {
        return name;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
