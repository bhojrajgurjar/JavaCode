package BuilderDemo;

public class BuilderDemo {
    public static void main(String ar[]){
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);

        sb.append(" def");
        System.out.println("New sb: "+sb);

        sb.reverse();
        System.out.println("New sb: "+sb);

        sb.reverse();
        System.out.println("New sb: "+sb);

        sb.replace(0, 3, "ABC");
        System.out.println("New sb: "+sb);


    }
}
