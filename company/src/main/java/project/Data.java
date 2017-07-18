package project;
import project.connection.DB;
import java.util.*;
import java.sql.*;
import java.util.function.Predicate;
import java.util.stream.Collectors.*;
import java.util.stream.Collectors;
import project.Employee_details.*;
public class Data
{
    
    static Connection con=DB.getCon();
    static List<Employee_details> emp=new ArrayList<Employee_details>();
            public Data()
        {
        try
        {
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("SELECT * FROM employee");
       while(rs.next())
        {
            Employee_details e=new Emp_builder().id(rs.getInt(1)).name(rs.getString(2)).team(rs.getString(3)).doj(rs.getString(4)).email(rs.getString(5)).salary(rs.getDouble(6)).getDetails();
            emp.add(e);
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


        public Predicate<Employee_details> filterTeam()
        {
            return x->x.getTeam().equals("Finance");
        }

        public List<Employee_details> getTeam(List<Employee_details> emp,Predicate<Employee_details> predict)
        {

                return emp.stream().filter(predict).collect(Collectors.toList());

        }

     /*   public Predicate<Employee_details> getTopSalary()
        {
            return true;
        }
    */
  public static void main(String[] args)
   {
      Data d=new Data(); 
      System.out.println(emp);
      System.out.println(d.getTeam(emp,d.filterTeam()));

    

   }
}