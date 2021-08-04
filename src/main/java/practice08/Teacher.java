package practice08;

import practice07.Student;

import java.text.MessageFormat;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
   public String introduce(){
       String introduce = super.introduce() + " I am a Teacher. ";

       if (klass!= null) {
           introduce += "I teach " + klass.getDisplayName() + ".";
       } else {
           introduce += "I teach No Class.";
       }

       return introduce;
   }
}
