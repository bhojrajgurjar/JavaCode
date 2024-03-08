package GenericsExample;

public class Student<T> {
    private T grade;

    public Student(T grade){
        this.grade = grade;
    }

    public void showGrade(){
        System.out.println("Scored Grade: "+grade);
    }

    public T getGrade() {
        return grade;
    }

    public void setGrade(T grade) {
        this.grade = grade;
    }
}
