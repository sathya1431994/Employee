package project.connection;
import java.util.*;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
public class DB
{
    static Connection conn;

    public static Connection getCon()
    {
        try {
            if(conn==null)
            {
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","");
            }
        } catch (Exception e) {
         e.printStackTrace();
        }

                return conn;
    }
   
}