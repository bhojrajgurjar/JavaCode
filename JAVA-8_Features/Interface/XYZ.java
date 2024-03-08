public class XYZ implements ABC {
    @Override
    public void display(){
        System.out.println("display() of XYZ called,,");
    }
    @Override
    public void show(){
        System.out.println("show of XYZ csllled..");
    }
//     @Override 
//     public void print(){
//         System.out.println("XYZ");              compile time  error
//     }

}
