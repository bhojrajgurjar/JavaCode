package TreeSet.pojo;

public class Student implements Comparable<Student> {
    private int rollno;
    private String name;

    public Student(){      };   

    public Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    public int getrollno() {
        return rollno;
    }

    public void setrollno(int rollno) {
        this.rollno = rollno;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
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
        Student Student = (Student) obj; //DwonCasting

        return this.rollno==Student.rollno;
    }

    
    @Override
    public int compareTo(Student other) {
        // if(this.rollno==other.rollno){
        //     return 0;
        // }
        // else if(this.rollno>other.rollno){
        //     return 1;
        // }
        // else{
        //     return -1;
        // }
        
        //return Integer.compare(this.rollno, other.rollno);
        //return this.name.compareTo(other.name);

        return this.rollno-other.rollno;
        
    }

}

