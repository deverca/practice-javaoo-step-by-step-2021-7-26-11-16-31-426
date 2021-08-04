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

    @Override
    public String introduce(){
        return MessageFormat.format("{0} I am a Teacher. I teach Class {1}.",super.introduce(),klass);
    }
}
