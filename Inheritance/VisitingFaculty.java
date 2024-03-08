//package Inheritance;

import Inheritance.Faculty;

public class VisitingFaculty extends Faculty {
    private int dailyWages;

    public VisitingFaculty(int dailyWages, String name,String subject){
        super(name, subject);
        this.dailyWages=dailyWages;
    }
    public void setDailyWages(int dailyWages){
        this.dailyWages=dailyWages;
    }
    public int getDailyWages(){
        return this.dailyWages;
    }
}
