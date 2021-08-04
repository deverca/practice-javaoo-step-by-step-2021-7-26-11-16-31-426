package practice06;

import java.text.MessageFormat;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        return MessageFormat.format("{0} I am a Teacher. I teach {1}."
                , super.introduce(),
                klass.getDisplayName());
    }

}
