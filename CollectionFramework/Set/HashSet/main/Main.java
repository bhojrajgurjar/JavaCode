package Set.HashSet.main;

import java.util.*;

import Set.HashSet.pojo.Student;


public class Main {
    public static void main(String ar[]){
        //Set<Student> set = new LinkedHashSet<>();         //In case of LikedHash insertion order maintain
        Set<Student> set = new HashSet<>();

        Student s1 = new Student(1, "Abhishek");
        Student s2 = new Student(1, "Arun");
        Student s3 = new Student(2, "Bhawesh");
        Student s4 = new Student(3, "Chetan");
        Student s5 = new Student(4, "Deepak");
        Student s6 = new Student(5, "Fateh Singh");

        set.add(s1);
        set.add(s2);        //not insert because duplication not allowed
        set.add(s3);
        set.add(s4);
        set.forEach(System.out::println);
        System.out.println("+++++++++++++++ After adding two more +++++++++++++++++++");
        set.add(s5);
        set.add(s6);
        set.forEach(System.out::println);

        // System.out.println("+++++++++++++++ After clear +++++++++++++++++++");
        // set.clear();
        // set.forEach(System.out::println);

        System.out.println("+++++++++++++++ toArray +++++++++++++++++++");
        Object[] arr =  set.toArray();
        for(Object item:arr){
            System.out.println(item);
        }

        System.out.println("+++++++++++++++ HasCode of elements of set  +++++++++++++++++++");
        for(Student s :set){
            System.out.println(s.getName() +"'s hashCode is: "+s.hashCode());
        }
        //set.forEach(System.out::println);
        
    }
}
