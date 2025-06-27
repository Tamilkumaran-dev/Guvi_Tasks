package Task3;

import java.util.Scanner;

public class CreateAccount {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("enter the name of account Holder : ");
        String Name = Input.nextLine();
        Account acc1 = new Account(Name);

        System.out.println("enter the deposit amount : ");
        int DepAmo = Input.nextInt();
        acc1.Deposit(DepAmo);

        System.out.println("enter the withdraw amount : ");
        int withdrawAmount = Input.nextInt();
        acc1.Withdraw(withdrawAmount);


        acc1.Balance();



    }
}
