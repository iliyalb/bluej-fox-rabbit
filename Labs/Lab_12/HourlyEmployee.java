import java.util.Date;

public class HourlyEmployee extends Employee
{
    private String name;
    private String hiredate;
    private double wagePerHour;
    private double hoursInMonth;
    
    public HourlyEmployee(String thename,String thedate,
                            double hourse,double wage){
        name=thename;
        hiredate=thedate;
        hoursInMonth=hourse;
        wagePerHour=wage;
        
    }
    
    public double monthlySalary(){

        return (wagePerHour*hoursInMonth);
    }
    
    public void print(){
        System.out.println("name: "+name+
        "\nsalary: "+monthlySalary());
        
    }
    
    
}
