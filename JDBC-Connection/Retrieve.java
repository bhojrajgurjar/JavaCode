import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retrieve {
    public static void main(String ar[]){
        String url = "jdbc:mysql://localhost:3306/Universal";

        String username = "root";
        String password = "root";
        try{
            // 1) Load the Database Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2) Get Connection with database
            Connection con = DriverManager.getConnection(url, username, password) ;

            // 3) Create statement to execute querry
            Statement sc = con.createStatement();
            

            // 4) Excute Querry
            String sql = "SELECT * FROM emp ";  //for retrieval 
            //String sql =  "Insert into emp(eno,ename,job,age,mgr,sal,deptno) values(11,'Anil','Junior Prof',25,3,15500,30)"; // for normal or bad practise, for good we use prepareStatement
            // String sql = "Insert into emp(eno,ename,job,age,mgr,sal,deptno) values(?,?,?,?,?,?,?)";
            // PreparedStatement pst = con.prepareStatement(sql);
            // pst.setInt(1,12);
            // pst.setString(2,"Rohit");
            // pst.setString(3, "Sales Executive");
            // pst.setInt(4, 24);
            // pst.setInt(5, 3);
            // pst.setInt(6,30000);
            // pst.setInt(7, 10);

            // try {
            //     pst.executeUpdate();
            //     System.out.println("Inserted Sucessfully");
            // } catch (Exception e) {
            //     // TODO: handle exception
            //     e.printStackTrace();
            // }


            //used for insertion with Statement only
            // try {
            //     sc.executeUpdate(sql);
            //     System.out.println("DATA Inserted Successfully");
            // } catch (Exception e) {
            //     // TODO: handle exception
            //     e.printStackTrace();
            // }

            //updation
            String updateSql = "UPDATE emp SET sal = ? WHERE eno = ?";
            PreparedStatement updateStmt = con.prepareStatement(updateSql);
            updateStmt.setInt(1, 110000);
            updateStmt.setInt(2, 1);
            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");


            // 5) Store result of query into Resultset
            ResultSet rs = sc.executeQuery(sql);        //for retrieval


            // 6) Process data from Resultset
            if(rs.isBeforeFirst()){
                 while(rs.next()){
                    System.out.println(rs.getInt("eno")
                                          +"  "+rs.getString("ename") 
                                                 +"  "+rs.getInt("sal"));
                }
            }
            else{
                System.out.println("No Employee Found!");
            }


            

            
            // 7) Close the database connection
            con.close();

        }
        catch (SQLException | ClassNotFoundException  e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
