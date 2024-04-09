public class Main
{
    public static void main(String[] args)
    {
        Cloth cloth1 = new Cloth("Jeans",2.00,Size.L);
        Cloth cloth2 = new Cloth("Shirt",3.00,Size.M);
        Cloth cloth3 = new Cloth ("Belt",4.00,Size.S);

        Cloth clothArray[] = new Cloth[3];
        clothArray[0] = cloth1;
        clothArray[1] = cloth2;
        clothArray[2] = cloth3;
        System.out.println(clothArray[2].GetSize());
        double fullPrice = ShopApp.CalculateSubTotal(clothArray);
        System.out.println("Clothing Array Price:  " +fullPrice);
        Student student1 = new Student("Dingle Bury",Size.M);
        Student student2 = new Student("Porter Peter",Size.XL);
        student2.printStudentID();
        student1.printStudentID();
        student2.printStudentID();
        student1.printStudentID();
        Student student3 = new Student("Noogai",Size.L);
        student3.printInfo();
        System.out.println("Does cloth2 fit any of the students?");
        boolean boolin = ShopApp.IsAFit(student1, clothArray[1]);
        System.out.println("Student1?:  "+boolin);
        boolin = ShopApp.IsAFit(student2, clothArray[1]);
        System.out.println("student2?:  "+boolin);
        boolin = ShopApp.IsAFit(student3, clothArray[1]);
        System.out.println("student3?:  "+boolin);
        Manager manMan = new Manager("manMan",Size.S,2000);
        manMan.printInfo();
        HrlyEmployee employeeHr = new HrlyEmployee("Hauer",Size.XL,15.00);
        employeeHr.printInfo();
        Business businessProducts = new Business("Boots",9,500.00);
        businessProducts.PrintInfo();
        Customer[] customerArray;
        customerArray = new Customer[5];
        customerArray[0]=manMan;
        customerArray[1]=employeeHr;
        customerArray[2]=new Customer("Lindsay",Size.L);
        customerArray[3]=student1;
        customerArray[4]=student2;
        System.out.println("Discount Test: price of cloth2, the 3$ shirt");
        for(int i = 0;i<customerArray.length;i++)
        {
            customerArray[i].printInfo();
            customerArray[i].PrintPriceAfterDiscount(cloth2);
        }
        System.out.println("Attempting to set productprice and quantity to a negative");
        Business busy = new Business("SuperBoots",-9,-300);
        System.out.println(busy.CalculatePay());

        System.out.println("Array of Payables");
        Payable[] payableArray = {employeeHr,manMan,businessProducts,busy};
        ShopApp.printClassNamesOfPayableEntities(payableArray);
        Employee managerToEmployee = new HrlyEmployee("testguy",Size.XL,16.00);
        managerToEmployee.printInfo();
    }
}
