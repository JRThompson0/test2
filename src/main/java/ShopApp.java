public class ShopApp
{
    public static boolean IsAFit(Customer customer, Cloth cloth)
    {
        return customer.getSize()== cloth.GetSize();
    }
    public static double CalculateSubTotal(Cloth[] cloth)
    {
        double sum = 0.00;
        for(Cloth currentCloth:cloth)
        {
            sum+=currentCloth.GetPrice();
        }
        return sum;
    }
    public static void printClassNamesOfPayableEntities(Payable payable[])
    {
        for(Payable pay:payable)
            System.out.println(pay.getClass());
    }
}
