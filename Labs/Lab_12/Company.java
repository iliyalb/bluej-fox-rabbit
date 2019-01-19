import java.util.ArrayList;


public class Company
{
    private ArrayList<Employee> listEmp;
    
    public Company(){
        listEmp=new ArrayList<Employee>();
    }
    
    public void addEmployee(){
        HourlyEmployee e1=new HourlyEmployee("www","2343",3,1000);
        HourlyEmployee e2=new HourlyEmployee("ddd","2343",5,11000);
        HourlyEmployee e3=new HourlyEmployee("ccc","2343",11,4000);
        YearlyEmployee h1=new YearlyEmployee("hhwww","2343",1000);
        YearlyEmployee h2=new YearlyEmployee("hhddd","2343",11000);
        YearlyEmployee h3=new YearlyEmployee("hhccc","2343",4000);
        
        listEmp.add(e1);
        listEmp.add(e2);       
        listEmp.add(e3);
        listEmp.add(h1);
        listEmp.add(h2);
        listEmp.add(h3);
        
    }
    
    public void meanSalary(){
        
        int counter=0;
        double sum=0,avg=0;
        while(counter<listEmp.size()){
            sum+=listEmp.get(counter).monthlySalary();
           
            counter++;
        }
        
        avg=sum/listEmp.size();
        
        System.out.println("avg: "+avg);
    }
}
