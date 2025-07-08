package Task4Jul4.Task3;

import java.util.Scanner;

public class PrintWeekdays {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        String[] Weekdays ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
         try{
             System.out.println("Enter the index value");
             int userNum = Input.nextInt();
             if (userNum < 0 || userNum >= Weekdays.length) {
                 throw new IndexOutOfBoundsException("Index must be between 0 and 6.");
             }
             System.out.println(Weekdays[userNum]);

         }
         catch (Exception e){
            System.out.println(e.getMessage());
         }


    }
}
