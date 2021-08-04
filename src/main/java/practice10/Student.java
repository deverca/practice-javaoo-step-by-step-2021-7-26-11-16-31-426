package practice10;


import java.text.MessageFormat;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {

        return klass;
    }

    public String introduce() {
        String introduceString = MessageFormat.format("{0} I am a Student. ", super.introduce());
        if (!this.equals(klass.getLeader())) {
            introduceString += MessageFormat.format("I am at {0}.", klass.getDisplayName());

        } else {

            introduceString += MessageFormat.format("I am Leader of {0}.", klass.getDisplayName());
        }
        return introduceString;
    }

}
