public class Main {
    public static void main(String ar[]){
        ABC ref1 = new PQR();
        ref1.show();
        ref1.display();
        //ref1.print();   compile time error

        ABC ref2 = new XYZ();
        ref2.show();
        ref2.display();
        //ref2.print();   compile time error

        ABC.print();        //this is how we need to call static method of interface
    }
}
