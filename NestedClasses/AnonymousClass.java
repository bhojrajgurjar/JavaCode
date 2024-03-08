

interface  ABC{
    void show();
}
class Main{
    public static void main(String ar[]){ 
        ABC obj = new ABC(){
            @Override
            public void show(){
                System.out.println("new show called..");
           }
        };
        obj.show();
    }
}





// abstract class ABC{
//     abstract public void show();
// }
// class Main{
//     public static void main(String ar[]){ 
//         ABC obj = new ABC(){
//             @Override
//             public void show(){
//                 System.out.println("new show called..");
//            }
//         };
//         obj.show();
//     }
// }




// class ABC{
//     public void show(){
//         System.out.println("ABC's show() called...");
//     }
// }
// class Main{
//     public static void main(String ar[]){ 
//         ABC obj = new ABC(){
//             @Override
//             public void show(){
//                 System.out.println("new show called..");
//            }
//         };
//         obj.show();
//     }
// }
