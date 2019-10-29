import java.net.Socket;
import java.util.Scanner;

public class huawei {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String t = scanner.next();
//        System.out.println(Integer.valueOf(t.substring(2,t.length()),16).toString());
        int a = 100;
        System.out.println(Integer.toBinaryString(a));

        int b = 100;
        System.out.println(Integer.toOctalString(b));

        int c = 100;
        System.out.println(Integer.toHexString(c));

        int d = 1100100;
        System.out.println(Integer.valueOf(d+"",2));

        int e = 144;
        System.out.println(Integer.valueOf(e+"",8));

        int f = 64;
        System.out.println(Integer.valueOf(f+"",16));

        Socket socket = new Socket();
        socket.getLocalAddress().getHostAddress();
        System.out.println();


    }
}
