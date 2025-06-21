import java.util.Scanner;

public class ApplyDiscount {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the purchase amount ");
        int amount = Input.nextInt();

        if(amount <= 500){
            System.out.print("The final payable amount is " + amount);
        }
        else if(amount > 500 & amount <= 1000){

            System.out.println("10% discount applied");
            System.out.print("The final payable amount is " + (amount-amount*10/100));
        }
        else{
            System.out.println("20% discount applied");
            System.out.print("The final payable amount is " + (amount-amount*20/100));
        }
    }
}
