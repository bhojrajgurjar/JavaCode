package com.copyFileDemo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
    private File srcFile = new File("C:/Users/HP/Desktop/New folder/InputOutputStream/abc.txt");
    private File dstFile = new File("C:/Users/HP/Desktop/New folder/InputOutputStream/xyz.txt");

    public void copyFile(){
        try (FileInputStream fin = new FileInputStream(srcFile);
             BufferedInputStream bin = new BufferedInputStream(fin);
             FileOutputStream fout = new FileOutputStream(dstFile);
             BufferedOutputStream bout = new BufferedOutputStream(fout)) 
             {
                byte[] arr = new byte[1024];
                int count = 0;
                while((count = bin.read(arr))>0){
                    bout.write(arr, 0, count);
                    System.out.println(arr+"       "+count);
                }
             } 
        catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
