package com.ioDemo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamDemo{
    private File f1 = new File("C:/Users/HP/Desktop/New folder/InputOutputStream/abc.txt");

    public void writeData(){
        try(FileOutputStream  fout = new FileOutputStream(f1)){
            String str = "My name is Bhojraj Gurjar ";
            byte[] arr = str.getBytes();
            
            fout.write(arr);
            System.out.println("File writing completed");

        }catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public void readData(){
        try (FileInputStream fin = new FileInputStream(f1)) {
            int x= 0;
            String data="";
            while ((x=fin.read())!=-1) {
                data=data+ (char)x;
                
            }
            System.out.println("Data readed from file: "+data);
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}