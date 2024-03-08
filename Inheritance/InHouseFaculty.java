//package Inheritance;

import Inheritance.Faculty;

public class InHouseFaculty extends Faculty{
    private int salary;

    public InHouseFaculty(int salary,String name,String subject){
        super(name, subject);
        this.salary=salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
}
