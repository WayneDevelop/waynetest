package test;

public class Test
{
    public static Test t1 = new Test();
    {
         System.out.println("blockA");
    }
    static
    {
        System.out.println("blockB");
    }
    public static void main(String[] args)
    {
        Test t2 = new Test();
        String s = "祝你考出好成绩！";
        System.out.println(s.length());
    }
 }
