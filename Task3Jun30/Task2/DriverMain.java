package Task30Jun.Task2;

import java.util.Scanner;

public class DriverMain {
static public Scanner Input = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Enter the employee details");
        System.out.println("Enter the employee empID : ");
        int empID = Input.nextInt();
        Input.nextLine();
        System.out.println("Enter the employee Name : ");
        String empName = Input.nextLine();
        System.out.println("Enter the employee salary : ");
        int salary = Input.nextInt();
        Input.nextLine();
        Employee emp = new Employee(empID,empName,salary);

        emp.caleTax();

        System.out.print("enter the product id : ");
        String Pid = Input.nextLine();
        System.out.println("Enter the product price : ");
        int price = Input.nextInt();
        System.out.println("Enter number of quantity : ");
        int quantity = Input.nextInt();

        Product product = new Product(Pid,price,quantity);
        product.caleTax();


    }
}
