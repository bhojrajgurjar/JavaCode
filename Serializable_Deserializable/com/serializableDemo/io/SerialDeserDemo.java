package com.serializableDemo.io;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.serializableDemo.bean.Student;

public class SerialDeserDemo{
    private File f1 = new File("C://Users//HP//Desktop//New folder//Serializable_Deserializable//com//new.txt");

    public void writeData(){
        try(FileOutputStream fout = new FileOutputStream(f1);
            ObjectOutputStream out = new ObjectOutputStream(fout))
            {
                Student s1 = new Student(1, "Abhishek");
                Student s2 = new Student(2, "Ankita");
                Student s3 = new Student(3, "Arun");
                Student s4 = new Student(4, "Isha");
                Student s5 = new Student(5, "Vicky");

                out.writeObject(s1);
                out.writeObject(s2);
                out.writeObject(s3);
                out.writeObject(s4);
                out.writeObject(s5);
                
                System.out.println("Objects saved into file");

                out.close();
                fout.close();
            }
        catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    public void readData() {
        try (FileInputStream fin = new FileInputStream(f1);
             ObjectInputStream in = new ObjectInputStream(fin)) 
            {
                  
                  while(true){
                    try {
                        Student s = (Student) in.readObject();
                        System.out.println(s);
                    } catch (EOFException e) {
                        break;
                    }
                  }
                  
            } 
        catch (IOException | ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}