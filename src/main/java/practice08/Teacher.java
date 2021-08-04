package practice08;



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
    public String introduceWith(Student student){

        String introduceString= MessageFormat.format("{0} I am a Teacher. I ",super.introduce());
        if(klass.getNumber() == student.getKlass().getNumber()){
            introduceString+=MessageFormat.format("teach {0}.", student.getName());
        } else{
            introduceString+="don't teach "+ student.getName()+".";
        }

        return  introduceString;

    }
}
