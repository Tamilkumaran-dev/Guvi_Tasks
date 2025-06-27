package Task2;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Number of products : ");
        int Nop = Input.nextInt();
        Input.nextLine();
        Product[] Cart = ProductArray(Nop);
        Product HPP = FindHeightPrice(Cart);

        int Totalvalue = TotalAmount(Cart);
        System.out.println( "Total amount " + Totalvalue);




    }
    //Add product into a array
    public static Product[] ProductArray(int Nop){
        Scanner Input = new Scanner(System.in);
        Product[] products =new Product[Nop];
        for(int i=0;i<Nop;i++){

            System.out.println("Enter the product ID : " + (i+1));
            int Pid =i+1;
            System.out.println("Enter the "+(i+1)+" product name : ");
            String Name = Input.nextLine();
            System.out.println("Enter the "+i+1+" product price : ");
            int Price = Input.nextInt();
            System.out.println("Enter the "+i+1+" product quantity : ");
            int Quantity = Input.nextInt();
            Input.nextLine();
            Product P = new Product(Pid,Name,Price,Quantity);
            products[i] = P;
        }
        return products;
    }

    //Find highest price
    public static Product FindHeightPrice(Product[] products){
        int max = Integer.MIN_VALUE;
        Product Hightestprice = new Product();
        for(int i=0;i<products.length;i++){
                if(max < products[i].price){
                    max = products[i].price;
                    Hightestprice = new Product(products[i].pid,products[i].name,products[i].price,products[i].quantity);
                }
            }

        System.out.println("Highest priced product" );
        System.out.println("ID : " + Hightestprice.pid);
        System.out.println("Name : " + Hightestprice.name);
        System.out.println("Price : " + Hightestprice.price);
        System.out.println("Quantity : " + Hightestprice.quantity);
        return Hightestprice;
    }

    public static int TotalAmount(Product[] products){
        int Total = 0;
        for(int i=0;i<products.length;i++){
             Total += products[i].price*products[i].quantity;
        }
        return Total;
    }

}
