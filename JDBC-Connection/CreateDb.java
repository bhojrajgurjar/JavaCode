import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CreateDb{
    public static void main(String ar[]){
    try{
        String url = "jdbc:mysql://localhost:3306/ ";

        String dbName = "MyDB";
        String username = "root";
        String password = "root";

        Connection cn = DriverManager.getConnection(url, username, password);

        String db = "Create database "+dbName;

        Statement s = cn.createStatement();
        s.executeUpdate(db);
        s.close();

        JOptionPane.showMessageDialog(null, "DB Created", "Sucess" ,JOptionPane.INFORMATION_MESSAGE);
    }
    catch(Exception e){
        e.printStackTrace();
    }
 }
}



