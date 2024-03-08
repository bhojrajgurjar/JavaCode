package Oops;

//import Oops.Engine;
import java.util.Scanner;

public class Demo {
    public static void main(String []ar){
        Engine[] arr = new Engine[3];
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<arr.length;i++){
            arr[i] = new Engine();
            System.out.println("Enter capacity for Engine "+(i+1)+" : ");
            arr[i].setCapacity(sc.nextInt());
            System.out.println("Enter fuel for Engine "+(i+1)+" : ");
            arr[i].setFuel(sc.next());

        }
        System.out.println("All engines details: ");

        for(Engine e : arr){
            System.out.println("Capacity: "+e.getCapacity()+"\nFuel: "+e.getFuel());
        }



        // Engine e1 = new Engine();
        // e1.setCapacity(1300);
        // e1.setFuel("petrol");
        // System.out.println("e1's details:  ");
        // System.out.println("Capacity: "+e1.getCapacity()+"\nFuel: "+e1.getFuel());

    }
        // Engine e1 = new Engine();  //Non-parameterised constructor called
        // System.out.println("e1's details: ");
        // e1.showEngineDetails();

        // Engine e2 = new Engine(1500, "diesel");  //parameterised constructor called
        // System.out.println("e2's details: ");
        // e2.showEngineDetails();
    



    // public static void main(String ar[]){
    //     System.out.println("Engine e1's details: ");
    //     Engine e1 = new Engine();
    //     e1.manufactureEngine(1200, "petrol");
    //     e1.showEngineDetails();
    //     // System.out.println("After changing capacity of Engine ");
    //     // e1.changeCapacity(1400);
    //     // e1.showEngineDetails();

    //     System.out.println("Engine e2's details: ");
    //     Engine e2 = new Engine();
    //     e2.manufactureEngine(1300,"diesel");
    //     e2.showEngineDetails();
    //     // System.out.println("After changing capacity of Engine ");
    //     // e2.changeCapacity(1500);
    //     // e2.showEngineDetails();

    //     System.out.println("After changing company : ");
    //     e1.changeCompany("kirlsokar");        
    //     System.out.println("Engine e2's details: ");
    //     e1.showEngineDetails();
    //     System.out.println("Engine e2's details: ");
    //     e2.showEngineDetails();

        
    // }


    // public static void main(String ar[]){
    // Engine e = new Engine();
    // e.manufactureEngine();
    // e.showEngineDetails();
    // }

}
