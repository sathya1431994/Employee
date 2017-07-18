package project;
import project.connection.DB;
import java.util.*;
import java.sql.*;

public class Employee_details
{
    public String name,team,email,doj;
    double salary;
    int id;
  public Employee_details()
  {
  }
    public Employee_details(int id,String name,String team,String doj,String email,double salary)
{
     this.id=id;
    this.name=name;
    this.team=team;
    this.doj=doj;
    this.email=email;
    this.salary=salary;
}
    public String getTeam()

        {
            return this.team;
        }   
       public double getSalary()

        {
            return this.salary;
        }   
       

        public String toString()
        {
            return name+" "+team+" "+doj+" "+email+" "+salary;
        }

}