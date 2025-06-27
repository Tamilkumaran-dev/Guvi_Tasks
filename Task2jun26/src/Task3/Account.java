package Task3;

import java.awt.image.PackedColorModel;

public class Account {

    public  String name;
    public  int balance;

    public  Account(){

    }
    public Account(String name){
        this.name= name;
    }

    public void Deposit(int DepAmo){
        this.balance += DepAmo;
        System.out.println("Amount has been Deposit the current balance is :" + balance );
    }

    public void Withdraw(int WithdrawAmount){
        if(this.balance < WithdrawAmount){
            System.out.println("Insufficient balance");
        }
        else {
            this.balance -= WithdrawAmount;
            System.out.println(WithdrawAmount+ " has been withdraw successfully");
        }
    }

    public void Balance(){
        System.out.println("Balance amount is : " + this.balance);
    }

}
