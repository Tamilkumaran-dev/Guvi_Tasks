package Task4;

public class Employee extends Person {
    public int EmpID;
    public int Salary;

    public Employee(){

    }
    public Employee(String name,int EmpID,int Salary){
        super(name);
        this.EmpID=EmpID;
        this.Salary=Salary;
    }

    public void Display(){
        System.out.println("Employee ID " + this.EmpID );
        System.out.println("Employee Name " + this.Name);
        System.out.println("Employee Salary " + this.Salary);
    }

}
