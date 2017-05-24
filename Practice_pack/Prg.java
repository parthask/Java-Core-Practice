package Practice_pack;

// ONE OBJECT AND USE MULTIPLE CONSTRUCTOR

public class Prg
{
    public Prg()
    {
        System.out.println("In default constructor");
    }
    public Prg(int a)
    {
       this();
        System.out.println("In single parameter constructor");
    }
    public Prg(int b, int c)
    {
        this(b);
        System.out.println("In multiple parameter constructor");
    }
    public static void main(String s[])
    {
        Prg obj = new Prg(10, 20);
//      obj=  new Prg(66);
//        obj= new Prg();
    }
}