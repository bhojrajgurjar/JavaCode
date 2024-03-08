//package Inheritance;

public class Main{
    public static void main(String ar[]){
        InHouseFaculty f1 = new InHouseFaculty(50000, "Bhojraj","Mathematics" );
        System.out.println("Details of F1 faculty is ");
        System.out.println("Name: "+f1.getName()+"\nSubject: "
                                     +f1.getSubject()+"\nSalary: "+f1.getSalary());
        System.out.println();

        VisitingFaculty f2 = new VisitingFaculty(2000, "Rituraj","Science");
        System.out.println("Details of F2 faculty is ");
        System.out.println("Name: "+f2.getName()+"\nSubject: "
                                     +f2.getSubject()+"\nDailyWages: "+f2.getDailyWages());
        System.out.println();
    }
}

