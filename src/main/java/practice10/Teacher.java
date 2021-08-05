package practice10;


import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> linkedList;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
        klass.addTeachers(this);

    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.linkedList = klasses;
        klasses.forEach(klass1 -> klass1.addTeachers(this));

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
        } else {
            introduce.append("I teach No Class.");
        }

        return introduce.toString();
    }

    public String introduceWith(Student student) {

        List<Klass> newLinked;
        String introduceString = MessageFormat.format("{0} I am a Teacher. I ", super.introduce());
        newLinked = linkedList.stream().filter(klass -> klass.getNumber() == student.getKlass().getNumber()).collect(Collectors.toList());

        if (!newLinked.isEmpty()) {
            introduceString += MessageFormat.format("teach {0}.", student.getName());
        } else {
            introduceString += "don't teach " + student.getName() + ".";
        }
        return introduceString;

    }

    public boolean isTeaching(Student student) {
        return linkedList.contains(student.getKlass());
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

    public void notifyStudentJoined(Klass klass, Student student) {

        System.out.printf("I am %s. I know %s has joined Class %d.\n", this.getName(), student.getName(),
                klass.getNumber());


    }

    public void notifyAssignLeader(Klass klass, Student leader) {
        System.out.printf("I am %s. I know %s become Leader of %s.\n", this.getName(),
                leader.getName(), klass.getDisplayName());
    }
}
