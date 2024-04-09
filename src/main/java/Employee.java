abstract class Employee extends Customer implements Payable
{
    final double discount = .1;
    public Employee(String name, Size size)
    {
        super(name, size);
    }
    @Override
    public void PrintPriceAfterDiscount(Cloth cloth)
    {
        double subtotal = cloth.GetPrice();
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Employee discount");
        double total = subtotal*(1-discount);
        System.out.println("Total: "+total);
    }
}

