package practice07;

public class Teacher {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
