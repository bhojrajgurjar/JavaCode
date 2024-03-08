package Oops;

public class Engine{
    private int capacity;
    private String fuel;
     
    //constructor with zero parameter
    public Engine(){
    }

    //constructor with parameter
    public Engine(int cap, String f){
        capacity = cap;
        fuel = f;
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void setFuel(String fuel){
        this.fuel=fuel;
    }
    public String getFuel(){
        return this.fuel;
    }


    public void showEngineDetails(){
        System.out.println("Capacity: "+capacity+"\nFuel: "+fuel);
    }

}


    // private int capacity;
    // private String fuel;
     
    // //constructor with zero parameter
    // public Engine(){
    //     capacity = 1200;
    //     fuel="petrol";
    // }

    // //constructor with parameter
    // public Engine(int cap, String f){
    //     capacity = cap;
    //     fuel = f;
    // }

    // public void showEngineDetails(){
    //     System.out.println("Capacity: "+capacity+"\nFuel: "+fuel);
    // }



//      private int capacity;
//     private String fuel;
//     private static String company = "fial";

//     public void manufactureEngine(int cap, String f){
//         capacity = cap;
//         fuel = f;
//     }
//     public void showEngineDetails(){
//         System.out.println("Capacity: "+capacity+"\nFuel: "+fuel+"\nCompany: "+company);
//     }
//     public void changeCapacity(int cap){
//         capacity = cap;
//     }
//     public void changeCompany(String com){
//         company = com;
//     }


    // private int Capacity;
    // private String Fuel;
    // public void manufactureEngine(){
    //     Capacity = 1200;
    //     Fuel = "petrol";
    // }
    // public void showEngineDetails(){
    //     System.out.println("Capacity: "+Capacity+"\nFuel: "+Fuel);
    // }
