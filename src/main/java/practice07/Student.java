package practice07;


import java.text.MessageFormat;
import java.util.Collection;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        String introduceString = MessageFormat.format("{0} I am a Student. ", super.introduce());
        if (!klass.getLeader().equals(this)) {
            introduceString += MessageFormat.format("I am at {0}.", klass.getDisplayName());
        } else {

            introduceString += MessageFormat.format("I am Leader of {0}.", klass.getDisplayName());
        }
        return introduceString;
    }

}
