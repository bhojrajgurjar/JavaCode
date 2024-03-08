public class LambdaExpression {
   public static void main(String ar[]){
        functionalInterface ref = new functionalInterface(){
            @Override
            public int calculate(int x,int y){
                return (x+y);
            }
            // @Override
            // public void printName(String name){
            //     System.out.println(name);
            // }
        };

       System.out.println( ref.calculate(4, 5));
    //    ref.printName("Bhojraj");


    //    //Using Lambda Expression
       functionalInterface add = (x,y)->(x+y);
       System.out.println(add.calculate(5, 10));

    //    add = (x,y)->(x-y);
    //    System.out.println(add.calculate(10, 5));

   } 
}
