package NeedOfGenerics;

public class NeedOfGenerics{
    public static void main(String ar[]){
        String hello = "hello";
        String hi = "hiii";

        String str1 = (String) method1(hello);   //Down Caasting
        String str2 = method(hi);                //No need of downcasting because of generics  

        System.out.println(str1);
        System.out.println(str2);
    }
    static <T> T method(T param){
        return param;
    } 

    static Object method1(Object param){
        return param;
    }   
}