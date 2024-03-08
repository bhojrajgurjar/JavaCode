//Try with resource
package com.expDemo.main;

import java.io.*;

public class Main{
    //Using throws keyword
    public static void main(String ar[]) throws IOException{
        FileWriter writer = new FileWriter("/Users/HP/Documents/JAVA/New folder/ExceptionHandling/com/expDemo/main/new.txt");
        writer.write("Once again I love my country");
        writer.close();
    }




    // public static void main(String ar[]){
    //     try(FileWriter writer = new FileWriter("/Users/HP/Documents/JAVA/New folder/ExceptionHandling/com/expDemo/main/new.txt")){
    //         writer.write("I love my Country");
    //         System.out.println("File done");
    //         writer.close();
    //     }catch(IOException e){
    //         e.printStackTrace();
    //     }
    // }
}





// //Exception handling by JVM

// package com.expDemo.main;

// import java.util.Scanner;

// public class Main{
//     public static void  main(String ar[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter two num: ");
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();

//         try {
//             System.out.println("Division is " +(num1/num2));
//         } catch (ArithmeticException e) {
//             // TODO: handle exception
//             //System.out.println("Dividing by 0 not allowed");
//             System.out.println(e.getMessage());
//             System.out.println(e);
//             e.printStackTrace();
//         }
//         System.out.println("helooooooooo................");
//     }
// }





//Exception handling by developer

// package com.expDemo.main;

// import java.util.Scanner;

// public class Main{
//     public static void main(String ar[]){
//         String str = "hi, how are you?";
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter position for "+
//                                "character to be displayed from Str");
//         int position = sc.nextInt();

//         try{
//             System.out.println("character present at given"+
//                                     " position: "+ str.charAt(position));
//         }catch(StringIndexOutOfBoundsException ex){
//             //System.out.println("Please enter position within the range");
//             ex.printStackTrace();
//        }

//        System.out.println("hello");
//     }
// }