package practice02;

public class Student extends Person {

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {

        return "I am a Student. I am at Class " + klass + ".";

    }
}
