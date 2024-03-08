import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Insertion {
    public static void main(String ar[]){
        try{
            String url = "jdbc:mysql://localhost:3306/MyDB";
            //String dbName = "MyDB";
            String username = "root";
            String password = "root";

            Connection cn = DriverManager.getConnection(url, username, password);
            //Statement st = cn.createStatement();
            
            // String querry = "CREATE TABLE Teacher ("+
            //                      " empId INT PRIMARY KEY,"+
            //                      " name VARCHAR(50),"+
            //                      " courseName VARCHAR(50)"+
            //                 ")";
            //st.executeUpdate(querry);

            String sql = "INSERT INTO Student(rollNo,name,adress)"+
                                     "values(?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, 1);
            pst.setString(2,"Abhishek");
            pst.setString(3, "Indore");
            ResultSet rs = pst.executeQuery(sql);
            pst.close();
            cn.close();


            JOptionPane.showMessageDialog(null, "DATA INSERTED", "Sucess" ,JOptionPane.INFORMATION_MESSAGE);

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Failed" ,JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
