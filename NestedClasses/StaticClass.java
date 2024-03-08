

class ABC {
    private static int length=30;
    static class PQR{
        private static int width=20;
        public static void area(){
            System.out.println("Area: "+(length*width));
        }
        public void show(){
            System.out.println("show called...");
        }
    }
}

class Main{
    public static void main(String ar[]){
        ABC.PQR.area();
        ABC.PQR ref = new ABC.PQR();
        ref.show();
    }
}
