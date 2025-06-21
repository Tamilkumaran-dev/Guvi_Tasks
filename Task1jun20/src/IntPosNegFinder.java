import java.util.Scanner;

public class IntPosNegFinder {

    public static void main(String[] args){
        Scanner Intput = new Scanner(System.in);
        System.out.print("Enter a positive or a negative number : ");
        int UserInt = Intput.nextInt();
        if(UserInt>0){
            System.out.println("it is a positive integer");
        }
        else if(UserInt < 0){
            System.out.println("it is a Negative integer");
        }
        else{
            System.out.println("You entered Zero");
        }

    }

}
