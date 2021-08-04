package practice06;

import java.text.MessageFormat;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        String introduce = super.introduce() + " I am a Teacher. ";

        if (klass!= null) {
            introduce += " I teach " + klass.getDisplayName() + ".";
        } else {
            introduce += "I teach No Class.";
        }

        return introduce;
    }

    public String introduceWith(Student student){

        return MessageFormat.format("{0} I am a Teacher. I teach {1}.",super.introduce(), student.getName());

    }
}
