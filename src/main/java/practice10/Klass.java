package practice10;


import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private Student leader;
    private Teacher teacher;
    private List<Student> members;
    private List<Teacher> teachers;


    public int getNumber() {
        return number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if (members != null && members.contains(leader)) {
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {

        members = new ArrayList<>();
        members.add(student);
        teachers.stream().forEach(teacher -> teacher.notifyStudentJoined(this, student));
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public List<Student> getMembers() {
        return members;
    }

    public void setMembers(List<Student> members) {
        this.members = members;
    }

    public void addTeachers(Teacher teacher) {
        teachers = new ArrayList<>();
        teachers.add(teacher);
    }
}
