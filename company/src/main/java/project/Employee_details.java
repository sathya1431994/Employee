package project;
import project.connection.DB;
import java.util.*;
import java.sql.*;

public class Employee_details
{
    public String name,team,email,doj;
    float salary=10000.00f;
    int id;
  public Employee_details()
  {
  }
    public Employee_details(int id,String name,String team,String doj,String email,float salary)
{
     this.id=id;
    this.name=name;
    this.team=team;
    this.doj=doj;
    this.email=email;
    this.salary=salary;
}
        public String toString()
        {
            return id+" "+name+" "+team+" "+doj+" "+email+" "+salary;
        }

}