import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo{
    public static void main(String[] args) {
        // String s1 = new String("hi");
        // String s2 = "hello";
        // String s3 = "hello";
        // String s4 = new String("hi4"); 
        // if(s1==s4){
        //     System.out.println("s1 equals s4");
        // }
        // else{
        //     System.out.println("s1 not equals s4");
        // }
        // if(s2==s3){
        //     System.out.println("s2 equals s3");
        // }
        // else{
        //     System.out.println("s2 not equals s3");
        // }

        //String is immutable class

        // String s1  = "abc";
        // s1.toUpperCase();               //this returns new object not make changes in s1
        // System.out.println("s1: "+s1);        //print abc 

        // String s2 = s1.toUpperCase();         
        // System.out.println("s2: "+s2);        //print ABC

        // s1 = s1.toUpperCase();
        // System.out.println("s1: "+s1);              //print ABC

        // String s1 = "hi, how are you.";

        // String s2 = "I am fine ";

        // System.out.println("length of s1: "+s1.length());
        // System.out.println("Is 'how' present in s1: "+s1.contains("how"));
        // System.out.println("'how' is present in s1 at index:"+s1.indexOf("how"));
        // System.out.println("lets print String after index 3 : " +s1.substring(4));
        // System.out.println("lets say: "+s1.substring(0, 3));

        // System.out.println("lets replace 'h' with 'H' in s1: "+s1.replace("h", "H"));

        // // String[] arr = s1.split("");
        // // System.out.println("Individual words String: ");
        // // for(String s:arr){
        // //     System.out.println(s);
        // // }
        // String[] arr1 = s1.split(" ");
        // System.out.println("Individual String: ");
        // for(String s:arr1){
        //     System.out.println(s);
        // }

        // StringTokenizer tokenizer = new StringTokenizer(s2," ");
        // System.out.println("Individual form using Tokenizer: ");
        // while(tokenizer.hasMoreTokens()){
        //     System.out.println(tokenizer.nextToken());
        // }

        // StringJoiner joiner = new StringJoiner(" $ ");
        // joiner.add("Ram");
        // joiner.add("lakshman");
        // joiner.add("Bharat");
        // joiner.add("Shatrughan");
        // System.out.println(joiner);

// Capatslizing last letter of words of sentence
        String sentence = "this, is the sentence.";
        String result = lastWordCapatizing(sentence);
        System.out.println(result);

        
    }
    public static String lastWordCapatizing(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word:words){
            if(word.length()>0){
                if(word.charAt(word.length()-1)==',' | word.charAt(word.length()-1)=='.' ){
                    char lastChar = Character.toUpperCase(word.charAt(word.length()-2));
                    result.append(word.substring(0, word.length()-2)).append(lastChar).append(word.charAt(word.length()-1)).append(" ");

                }
                else{
                    char lastChar = Character.toUpperCase(word.charAt(word.length()-1));
                    result.append(word.substring(0, word.length()-1)).append(lastChar).append(" ");

                }
            }
        }

        return result.toString().trim();
    }
}