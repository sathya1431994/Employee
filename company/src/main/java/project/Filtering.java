/*package project;
import project.connection.DB;
import java.util.*;
import java.sql.*;
import java.util.function.Predicate;
import java.util.stream.Collectors.*;
import java.util.stream.Collectors;
import project.Employee_details.*;
class Filtering
{
     public Predicate<Employee_details> filterTeam()
        {
            return x->x.getTeam().equals("Finance");
        }

        public List<Employee_details> getTeam(List<Employee_details> emp,Predicate<Employee_details> predict)
        {

                return emp.stream().filter(predict).collect(Collectors.toList());

        }
}
*/