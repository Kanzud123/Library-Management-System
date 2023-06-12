import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {
   Connection conn; 
   
   public static Connection ConnecrDb(){
       try{
           Class.forName("org.sqlite.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User\\Downloads\\Library Management System\\Library Management System\\Library.sqlite");
           return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
       
   }
}
