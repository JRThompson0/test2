import java.util.Scanner;

public class Business implements Payable
{
    private String name;
    private int productQtySupplied;
    private double productPrice;
    public Business(String name, int qty, double price)
    {
        this.name=name;
        this.productQtySupplied=qty;
        while(productQtySupplied<0)
        {
            System.out.println("Try again. How many units of "+name+" were supplied?");
            Scanner textScan = new Scanner(System.in);
            this.productQtySupplied = textScan.nextInt();
        }
        this.productPrice=price;
        while(productPrice<0)
        {
            System.out.println("Try again. What's the price of "+name+" per unit?");
            Scanner textScan = new Scanner(System.in);
            productPrice=Double.parseDouble(textScan.nextLine());
        }
    }
    @Override
    public double CalculatePay()
    {
        return productQtySupplied*productPrice;
    }
    public void PrintInfo()
    {
        System.out.println("Product: "+name);
        System.out.println("Qty:  "+productQtySupplied);
        System.out.println("PricePerProduct:  "+productPrice);
    }
    public String GetName()
    {
        return name;
    }
}
