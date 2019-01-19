
import java.util.Date;

public class YearlyEmployee extends Employee
{
    private String name;
    private String hiredate;
    private double employeeSalary;
        
    public YearlyEmployee(String thename, String thedate,double salary){
        
        name=thename;
        hiredate=thedate;
        employeeSalary=salary;
    }
    
    public double monthlySalary(){
       
        return (employeeSalary/12);
    }
    
    public void print(){
        System.out.println("name: "+name+
        "\nsalary: "+monthlySalary());
        
    }
    
    
}
