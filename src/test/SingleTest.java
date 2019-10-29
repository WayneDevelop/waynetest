package test;

public class SingleTest {
    public static void main(String[] args) {
        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();
        System.out.println(single1==single2);
    }

}

class Single{
    private static Single obj = new Single();
    private Single(){};
    public static Single getInstance(){
        return obj;
    }
}
