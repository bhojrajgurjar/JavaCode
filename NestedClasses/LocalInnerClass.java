
    class ABC{
        private int length=30;
        public void calculate(){
            int width=20;  //effectively final local variable
            class PQR{
                public void area(){
                    System.out.println("Area: "+(length*width));
                }
            }
            PQR obj = new PQR();
            obj.area();
        }
       
    }

    class Main{
        public static void main(String ar[]){
            ABC obj1 = new ABC();
            obj1.calculate();
        }
    }

