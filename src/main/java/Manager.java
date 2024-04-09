import java.util.Scanner;

public class Manager extends Employee
{
    final double discount = .15;
    private double salary;
    public Manager(String name, Size size,double salaryMonthly)
    {
        super(name, size);
        this.salary = salaryMonthly;
        while(salary<0)
        {
            System.out.println("Bad salary entered. Try again.");
            Scanner textScan = new Scanner(System.in);
            this.salary = Double.parseDouble(textScan.nextLine());
            textScan.close();
        }
    }
    @Override
    public double CalculatePay()
    {
        return salary/2;
    }
    @Override
    public void PrintPriceAfterDiscount(Cloth cloth)
    {
        double subtotal = cloth.GetPrice();
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Manager discount");
        double total = subtotal*(1-discount);
        System.out.println("Total: "+total);
    }
    @Override
    public void printInfo()
    {
        System.out.println("Employee Name: "+this.getName());
        System.out.println("Employee Size:  "+this.getSize());
        System.out.println("Employee Monthly Salary:  "+salary);

    }
}
