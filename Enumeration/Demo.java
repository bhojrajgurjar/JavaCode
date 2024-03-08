
enum Laptop{
    Macbook(2200), XPX(2500), Surface(), ThinkPad(1600);

    private int price;

    Laptop(){
        price=500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Laptop(int price){
        this.price = price;
    }
}

class Demo{

    public static void main(String ar[]){
        Laptop[] lp = Laptop.values();
        //System.out.println(lp.getClass().getSuperclass());

        for(Laptop l:lp){
            System.out.println(l+" price is "+l.getPrice());
        }
    }
}