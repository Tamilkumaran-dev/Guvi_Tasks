import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        int num = userinput.nextInt();
        String numStr = String.valueOf(num);
        String reverseStr = "";
        for(int i=numStr.length()-1;i>=0;i--){
            reverseStr += numStr.charAt(i);
        }
        int setback = Integer.parseInt(reverseStr);
        System.out.println("reverse value "+ setback);
  }
}
