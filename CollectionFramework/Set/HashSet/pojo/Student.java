package Set.HashSet.pojo;

public class Student {
    private int rollno;
    private String name;

    public Student(){      };   

    public Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return rollno +" : "+name;
    }

    @Override
    public int hashCode(){
        int number=7;
        int hash = 20*number +rollno;

        return hash;
    }
    @Override
    public boolean equals(Object obj){
        Student student = (Student) obj; //DwonCasting

        return this.rollno==student.rollno;
    }

}
