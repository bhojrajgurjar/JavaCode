package TreeSet.main;

import java.util.TreeSet;

import TreeSet.Comparator.IdComparator;
import TreeSet.Comparator.NameComparator;
import TreeSet.pojo.*;

public class TreeSetMain {
    public static void main(String ar[]){
        TreeSet<Student> tset = new TreeSet<>();

        Student s1 = new Student(1, "Abhishek");
        Student s2 = new Student(2, "Bhawesh");
        Student s3 = new Student(3, "Chetan");

        tset.add(s1);
        tset.add(s2);
        tset.add(s3);
        for (Student student : tset) {
            System.out.println(student);
        }

        System.out.println("Employee work start from here................");

        System.out.println("++++++++++++ using IdComparator  +++++++++++++++++=");
        TreeSet<Employee> eset =  new TreeSet<>(new IdComparator());

        Employee e1 = new Employee(2021, "Ram");
        Employee e2 = new Employee(2022, "Bhawesh");
        Employee e3 = new Employee(2023, "Satveek");

        eset.add(e1);
        eset.add(e2);
        eset.add(e3);

        eset.forEach(System.out::println);

        System.out.println("+++++++++++++++++ using NameComparator +++++++++++++++++++");
        TreeSet<Employee> eset2 =  new TreeSet<>(new NameComparator());

        eset2.add(e1);
        eset2.add(e2);
        eset2.add(e3);

        eset2.forEach(System.out::println);

        System.out.println("+++++++++++++ using lambda Function (Through Id) ++++++++++++++++++");
        TreeSet<Employee> eSet3 = new TreeSet<>((o1,o2)->o1.getempId()-o2.getempId());

        eSet3.add(e1);
        eSet3.add(e2);
        eSet3.add(e3);
        eSet3.forEach(System.out::println);

        System.out.println("+++++++++++++ using lambda Function (Through Name) ++++++++++++++++++");
        TreeSet<Employee> eSet4 = new TreeSet<>((o1,o2)->o1.getempName().compareTo(o2.getempName()));

        eSet4.add(e1);
        eSet4.add(e2);
        eSet4.add(e3);
        eSet4.forEach(System.out::println);
    }
}
