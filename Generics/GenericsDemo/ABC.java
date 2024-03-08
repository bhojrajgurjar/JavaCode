package GenericsDemo;

public class ABC {
    public <T> void show(T param){
        System.out.println("show() called with parameter: "+param);
    }
}
