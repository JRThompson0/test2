public class Customer extends Person
{
    private Cloth clothingItems[];
    public Customer(String name, Size size)
    {
        super(name, size);
    }
    public void PrintPriceAfterDiscount(Cloth cloth)
    {
        double subtotal = cloth.GetPrice();
        System.out.println("No discounts available");
    }
}
