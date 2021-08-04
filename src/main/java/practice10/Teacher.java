package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> linkedList;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.klass = klass;
        this.linkedList = linkedList;

    }

    public String introduce() {
        StringBuilder introduce = new StringBuilder(super.introduce() + " I am a Teacher. ");

        if (linkedList != null) {
            introduce.append("I teach Class ");
            for (Klass klass : linkedList) {
                int i;
                introduce.append(klass.getNumber());
                if (klass != linkedList.getLast()) {
                    introduce.append(", ");
                }
            }

            introduce.append(".");
        }

        return introduce.toString();
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
