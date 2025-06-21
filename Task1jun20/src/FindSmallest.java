import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.println("enter the value of `A` ");
        int a = Input.nextInt();
        System.out.println("enter the value of `B` ");
        int b = Input.nextInt();
        System.out.println("enter the value of `C` ");
        int c = Input.nextInt();

        if(a < b & a < c){
            System.out.println("`A` is the smallest number");
        }
        else if(b < a & b < c){
            System.out.println("`B` is the smallest number");
        }
        else{

                System.out.println("`C` is the smallest number");
        }
    }

}
