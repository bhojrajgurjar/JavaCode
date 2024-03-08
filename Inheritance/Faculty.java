package Inheritance;

public class Faculty{
    private String name;
    private String subject;

    public Faculty(){
        //e
    }

    public Faculty(String name, String subject){
        this.name=name;
        this.subject=subject;
    }
    public void setName(Striing name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }
}