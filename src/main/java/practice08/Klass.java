package practice08;

public class Klass {

    private int number;
    private Student leader;


    public Klass(int number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getDisplayName() {
        return "Class " + number;
    }
    public void assignLeader(Student leader) {
       // this.leader = leader;
       System.out.print("It is not one of us.\n");

    }

    public Student getLeader() {
        return leader;
    }

}
