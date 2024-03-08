abstract class Animal {
    public abstract void reproduce();
    
}

class shark extends Animal{
    @Override
    public void reproduce(){
        System.out.println("shark reproduce");
    }
}

class sparrow extends Animal{
    @Override
    public void reproduce(){
        System.out.println("Sparrow reproduce");
    }
}

class Demo{
    public static void main(String ar[]){
        Animal s = new shark();
        s.reproduce();
        Animal b = new sparrow();
        b.reproduce();
    }
}