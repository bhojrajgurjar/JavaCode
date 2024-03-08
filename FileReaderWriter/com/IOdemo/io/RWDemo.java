package com.IOdemo.io;

import java.io.*;

public class RWDemo{
    private File f1 = new File("/Users/HP/Desktop/New folder/InputOutputStream/com/new.txt");

    public void writeData(){
        try(FileWriter writer = new FileWriter(f1)){
            String str = "Again I love my country Hello, my name is Bhojraj Gurjar, and I come from Barwaha, near the Omkareshwar Jyotirling situated at the banks of the Narmada River. I completed my schooling in Barwaha and later pursued my Bachelor's in Computer Applications (BCA) at Chameli Devi Institute of Professional Studies in Indore.\r\n" + //
                    "\r\n" + //
                    "Currently, I am undertaking my Master's in Computer Applications (MCA) at IPS Academy, Indore.\r\n" + //
                    "\r\n" + //
                    "In terms of my strengths, I consider myself a composed individual. Regardless of the challenges that come my way, I always try to maintain a calm behaivour. This quality not only enhances my problem-solving skills in daily life but also contributes to my professional approach. Additionally, honest is my strength that got most apreciation from peoples.\r\n" + //
                    "\r\n" + //
                    "On the flip side, one area I'm working on is expressing my thoughts and feelings more openly. I sometimes tend to keep my emotions or opinions to myself.\r\n" + //
                    "\r\n" + //
                    "When it comes to technical skills, I possess a solid understanding of programming languages such as Java, scripting languages like JavaScript, styling languages including CSS, structural language HTML, and SQL for database management. I am also familiar with tools such as MySQL, Netlify,Github, and Bootstrap.\r\n" + //
                    "\r\n" + //
                    "In terms of my family background, I come from a decent and respected family.My family really value being spiritual. We own ancestral land used for farming, and my father actively engages in agriculture. .\r\n" + //
                    "\r\n" + //
                    "Moving beyond academics, playing cricket has been a passion of mine since childhood. Additionally, visiting temples and holy places brings me immense peace. Lastly, I find joy in assisting my father with farming, connecting me to our ancestral roots.\r\n" + //
                    "\r\n" + //
                    "I am eager to bring my technic\r\n" + //
                    "al skills and positive approach to contribute effectively to your team. Thank you for giving me opportunity to introduce myself\" \r\n" + //
                    "\r\n" + //
                    "\r\n" + //
                    "";
            writer.write(str);
            System.out.println("Work done");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void readData(){
        try (FileReader reader = new FileReader(f1)) {
            int x=0;
            String data="";
            while((x=reader.read())!=-1){
                data = data+(char)x;
            }
            System.out.println("Data readed from file: "+data);
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void readLineByLine(){
        try (FileReader reader = new FileReader(f1);
             BufferedReader br = new BufferedReader(reader)) 
             {
                String data = "";
                System.out.println("Data readed line by line from file: ");
                while ((data=br.readLine())!=null) {
                    System.out.println(data);
                }
             }
        catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void readBulkData(){
        try (FileReader reader = new FileReader(f1);
             BufferedReader br = new BufferedReader(reader)) 
             {
                String data="";
                char[] arr = new char[50];
                int count = 0;
                System.out.println("Data readed in bulk: ");

                while ((count=br.read(arr))>0) {
                    data = new String(arr, 0, count);
                    //System.out.println(arr +"\n"+count+"\n");
                    System.out.println(data);
                }
             }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}