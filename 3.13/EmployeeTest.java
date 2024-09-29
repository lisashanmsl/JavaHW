public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ian","Chun", 5000);
        Employee employee2 = new Employee("Tina", "Wang", 4000);

        System.out.println("Yearly salary:");
        System.out.printf("%s %s: $%.2f%n",employee1.get_fname(),employee1.get_lname(),(employee1.get_monSalary()*12));
        System.out.printf("%s %s: $%.2f%n%n",employee2.get_fname(),employee2.get_lname(),(employee2.get_monSalary()*12));

        System.out.println("After 10% raise:");
        System.out.printf("%s %s: $%.2f%n",employee1.get_fname(),employee1.get_lname(),((employee1.get_monSalary()*12)
        *1.1));
        System.out.printf("%s %s: $%.2f%n",employee2.get_fname(),employee2.get_lname(),((employee2.get_monSalary()*12)
        *1.1));
    }
}
