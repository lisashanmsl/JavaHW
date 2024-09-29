public class Employee{
    //instance variable
   private String first_name;       
   private String last_name;
   private double monthly_salary;

    //constructor
   public Employee(String first_name, String last_name, double monthly_salary){
    this.first_name = first_name;
    this.last_name = last_name;
    if(monthly_salary > 0.0){
        this.monthly_salary = monthly_salary;
    }
   }
   public void set_fname(String first_name){
    this.first_name = first_name;
   }
   public void set_lname(String last_name){
    this.last_name = last_name;
   }
   public void set_monSalary(double monthly_salary){
    if(monthly_salary > 0.0){
        this.monthly_salary = monthly_salary;
    }
   }
   public String get_fname(){
    return first_name;
   }
   public String get_lname(){
    return last_name;
   }
   public double get_monSalary(){
    return monthly_salary;
   }
}