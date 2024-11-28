import java.util.*;
class Employee{
    private String name;
    private String department;
    private double salary;

    public Employee(String name,String department,double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public String getname(){
        return name;
    }
    public String getdepartment(){
        return department;
    }

    public double getsalary(){
        return salary;
    }
    @Override
    public String toString() {
        return name;
    }
}
class Handle{   
    private List<Employee> employees;

    public Handle(){
        employees=new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public List<Employee> findDepartmentName(String department){
        List<Employee> result=new ArrayList<>();
        for(Employee employee: employees){
            if(employee.getdepartment().equalsIgnoreCase(department)){
                result.add(employee);
            }
        }
        return result;
    } 
}

public class Main{
    public static void main(String[] args) {
        Handle handle=new Handle();
          handle.addEmployee(new Employee("Pratik","IT",60000));
          handle.addEmployee(new Employee("Sumit","IT",60000));
          handle.addEmployee(new Employee("Brajdeep","IT",60000));
          handle.addEmployee(new Employee("Aditya","HR",60000));
          handle.addEmployee(new Employee("Alok","non tech",60000));

          String department="IT";
          System.out.println(new ArrayList<Employee>(handle.findDepartmentName(department)));
    }
}
