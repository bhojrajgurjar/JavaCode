package com.packageDemo.main;

import com.p1.Student;
import com.p1.p2.Employee;

public class Demo extends Student {
    public static void main(String ar[]){
        Student obj = new Student();
        obj.show();
        //obj.display();
        //obj.print();

        Demo ref = new Demo();
        //ref.display();
        ref.print();

        Employee e = new Employee();
        e.show();
    }
}
