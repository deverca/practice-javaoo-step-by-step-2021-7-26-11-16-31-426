package practice05;


import java.text.MessageFormat;

public class Teacher extends Person {

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        String introduce = super.introduce() + " I am a Teacher.";

        if (klass != 0) {
            introduce += " I teach Class " + klass + ".";
        } else {
            introduce += "I teach No Class.";
        }

        return introduce;
    }
}
