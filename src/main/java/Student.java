public class Student extends Customer
{
    long studentID;
    static long uniqueID;
    final double discount = .05;
    public Student(String name,Size size)
    {
        super(name,size);
        this.studentID=uniqueID+1;
        uniqueID++;
    }
    public void printStudentID()
    {
        System.out.println("Student ID number:  "+this.studentID);
    }
    public void printInfo()
    {
        System.out.println("Student Name:  "+ this.getName());
        System.out.println("Student ID:  "+ this.studentID);
    }
    public void PrintPriceAfterDiscount(Cloth cloth)
    {
        double subtotal = cloth.GetPrice();
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Student discount");
        double total = subtotal*(1-discount);
        System.out.println("Total: "+total);
    }
}
