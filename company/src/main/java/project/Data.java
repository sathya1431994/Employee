package project;
import project.connection.DB;
import java.util.*;
import java.sql.*;

public class Data
{
    static Connection con=DB.getCon();

public Data()
{
try{
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("SELECT name,team,DOJ,email,salary FROM employee");
       while(rs.next())
        {
             
             Employee_details e=new Emp_builder().getDetails();
         //  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
        }
 
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
        finally
        {
            try
            {
        con.close();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
    
        }

}
    
  public static void main(String[] args)
   {
      new Data(); 
       
}
}