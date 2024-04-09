import java.util.Scanner;
public class Cloth
{
    private String name;
    private double price;
    private Size size;
    public Cloth(String name, double price, Size size)
    {
        this.name=name;
        this.size=size;
        if (price>0)
            this.price=price;
        else
        {
            while(price <= 0)
            {
                System.out.println("Bad price entered. Try again.");
                Scanner textScan = new Scanner(System.in);
                price = Double.parseDouble(textScan.nextLine());
                textScan.close();
            }
            this.price=price;
        }
    }
    public Size GetSize()
    {
        return size;
    }
    public double GetPrice()
    {
        return price;
    }
    public String GetName()
    {
        return name;
    }
}
