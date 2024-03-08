import java.lang.Cloneable;

class abc implements Cloneable{
    int x;
    String y;

    public abc(int x, String y){
        this.x=x;
        this.y=y;
    }

    @Override
    public  Object clone() throws CloneNotSupportedException{
        return super.clone();
    } 
} 

public class Demo{
    public static void main(String ar[]) throws CloneNotSupportedException{
        abc obj1 = new abc(11, "I love my country");
        abc obj2  = (abc) obj1.clone();
        System.out.println(obj2.x); 
        System.out.println(obj2.y); 
    }
}