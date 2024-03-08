// Default and Static methods in Interface

public interface ABC {

    void display();

    default void show(){
        System.out.println("default show() of ABC called..");
    }
    static void print(){
        System.out.println("static print() of ABC called...");
    }
}
