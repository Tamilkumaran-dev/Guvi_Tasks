package Task30Jun.Task2;

public class Product implements Taxable {
    public String pid;
    public int price;
    public int quantity;

    public  Product(){

    }
    public Product(String pid,int price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void caleTax() {
        System.out.println( this.pid + " Total amount for this product with tax " + (this.price+this.price*this.salesTax/100)*this.quantity);
    }
}
