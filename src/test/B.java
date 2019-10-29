package test;

public class B
{
    public static B t1 = new B();
    public static B t2 = new B();
    {
        System.out.println("构造块");
    }
    static
    {
        System.out.println("静态块");
    }
    public static void main(String[] args)
    {
        B t = new B();
        System.out.println(Math.round(11.5) );
        int a=10 ; double b=3.14;
        System.out.println('A'+a+b);
    }
}