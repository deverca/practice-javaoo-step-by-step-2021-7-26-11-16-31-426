package practice09;


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

    public LinkedList<Klass> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<Klass> linkedList) {
        this.linkedList = linkedList;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }
}
