    package project;
    import project.Employee_details;
    public class Emp_builder 
    {
        String name,team,email,doj;
        double salary;
        int id;
        public Emp_builder()
    {
    }
        public Emp_builder id(int id)
        {
            this.id=id;
            return this;
        } 
    public Emp_builder name(String name)
        {
            this.name=name;
            return this;
        } 
        public Emp_builder team(String team)
        {
            this.team=team;
            return this;
        } 
        public Emp_builder doj(String doj)
        {
            this.doj=doj;
            return this;
        } 
        public Emp_builder email(String email)
        {
            this.email=email;
            return this;
        } 
        public Emp_builder salary(double salary)
        {
            this.salary=salary;
            return this;
        } 
        
    public Employee_details getDetails()
        {
            return new Employee_details(id,name,team,doj,email,salary);
        }
    }