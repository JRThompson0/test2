import java.util.Scanner;
public class HrlyEmployee extends Employee
{
    private float hrsWorked;
    private double hrlyWage;
    public HrlyEmployee(String name, Size size, double wage)
    {
        super(name, size);
        hrsWorked=0;
        this.hrlyWage=wage;
        while(hrlyWage<15.00)
        {
            System.out.println("Bad Wage entered. Try again.");
            Scanner textScan = new Scanner(System.in);
            this.hrlyWage = Double.parseDouble(textScan.nextLine());
            textScan.close();
        }

    }
    public void addTime(float time)
    {
        hrsWorked+=time;
    }
    @Override
    public void printInfo()
    {
        System.out.println("Employee Name: "+this.getName());
        System.out.println("Employee Size:  "+this.getSize());
        System.out.println("Employee Wage:  "+hrlyWage);
        System.out.println("Hours worked:  "+hrsWorked);
    }

    @Override
    public double CalculatePay()
    {
        return hrsWorked*hrlyWage;
    }
}
