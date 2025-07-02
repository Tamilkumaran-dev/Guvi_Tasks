package Task30Jun.Task2;

public class Employee implements Taxable{

    public int empId;
    public String empName;
    public int salary;

    public Employee(){

    }

    public Employee(int empId,String empName,int salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public void caleTax() {
        System.out.println("your income tax for a year " +(this.salary*incomeTax/100));
    }


}
