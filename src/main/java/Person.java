public class Person
{
    private String name;
    private Size size;
    public Person(String name, Size size)
    {
        this.name=name;
        this.size=size;
    }
    public Size getSize()
    {
        return size;
    }
    public String getName()
    {
        return name;
    }
    public void  printInfo()
    {
        System.out.println("Name:  "+name);
        System.out.println("Size:  "+size);
    }
}

