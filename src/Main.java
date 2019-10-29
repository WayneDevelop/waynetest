import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > 100 || t <= 0) {
            return;
        }
        for (int i = 0; i < t; i++) {
            int result = 0;
            int n = scanner.nextInt();
            if (n > 100 || n <= 0) {
                return;
            }
            for (int j = 0; j < n; j++) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                if (x1 > 100 || x1 <= 0 || x2 > 100 || x2 <= 0 || y1 > 100 || y1 <= 0 || y2 > 100 || y2 <= 0) {
                    return;
                }
                result += (x2 - x1 + 1) * (y2 - y1 + 1);
            }
            System.out.println(result);
        }
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > 100 || t <= 0) {
            return;
        }
        for (int i = 0; i < t; i++) {
            int result = 0;

            int p1 = scanner.nextInt();
            int p2 = scanner.nextInt();
            int p3 = scanner.nextInt();
            int p4 = scanner.nextInt();
            int p5 = scanner.nextInt();
            int tmp = p1 + p2 + p3 + p4 + p5;
            if(tmp==0){
                result=-1;
            }else{
                if(tmp%5==0){
                    result = tmp/5;
                }else{
                    result=-1;
                }
            }

            System.out.println(result);
        }
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > 100 || t <= 0) {
            return;
        }
        for (int i = 0; i < t; i++) {
            long result = 0;

            long r = scanner.nextLong();
            long g = scanner.nextLong();
            long b = scanner.nextLong();

            if(r+g+b<3){
                result=0;
            }else {
                long tmp = (r + g + b) % 3;
                if (tmp == 0) {
                    result = (r + g + b) / 3;
                } else {
                    result = (r + g + b-tmp) / 3;
                }
            }

            System.out.println(result);
        }
    }

    public static void main44(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > 100 || t <= 0) {
            return;
        }
        for (int i = 0; i < t; i++) {
            int count = 0;
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            int n = scanner.nextInt();
            if (n > 100 || n <= 0) {
                return;
            }
            for (int j = 0; j < 2*n; j++) {
                int tmp = scanner.nextInt();
                list.add(tmp);
                sum+=tmp;
            }
            double flag = sum/(2*n);
            for (int k :list) {
                if(k>flag){
                    count ++;
                }
            }
            if(count>n){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > 100 || t <= 0) {
            return;
        }
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            int n = scanner.nextInt();
            if (n > 100 || n <= 0) {
                return;
            }
            for (int j = 0; j < 2*n; j++) {
                int tmp = scanner.nextInt();
                list.add(tmp);
            }
            list = list.stream().sorted().collect(Collectors.toList());
            int tmp = list.get(n-1);
            int tmp1 = list.get(n);
                if(tmp!=tmp1){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
    }

    public static void main77(String[] args) throws Exception{
        try {
            Class c=Class.forName(args[0]);
            Method m[]=c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i].toString());
            }
        } catch (Throwable e) {
            System.err.println(e);
        }

//        List<Integer> NumberList = new ArrayList<Integer>();
//        NumberList.add(2);
//        NumberList.add(4);
//        NumberList.add(1);
//        NumberList.add(3);
//        NumberList.add(5);
//        for(int i =0;i<NumberList.size();++i){
//            int v = NumberList.get(i);
//            if(v%2==0){
//                NumberList.remove(v);
//            }
//        }
//        System.out.println(NumberList);
        try {

        }finally {

        }

        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
        int [][][] a =new int[1][1] [1]   ;
    }

    public static void maintt(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        for (String str: list){
            StringBuffer resultLow = new StringBuffer("");
            StringBuffer resultUpp = new StringBuffer("");
            char[] chars = str.toCharArray();
            for (int i=0;i<chars.length;i++){
                char tmp = chars[i];
                if(Character.isUpperCase(tmp)){
                    resultUpp.append(tmp);
                }else {
                    resultLow.append(tmp);
                }
            }
            //resultUpp.toString().toCharArray()
            System.out.println(resultLow.append(resultUpp).toString());
        }
    }

    public static boolean isHuiWen(String str){
        int len = str.length();
        for (int i=0;i<len/2;i++){
            if(!(str.charAt(i)==str.charAt(len-i-1))){
                return false;
            }
        }
        return true;
    }

    public static String maxPalindromeString(String str){
        String maxStr ="";
        int len = 0;//保存回文串长度
        int maxLen=0;//保存最长回文串的长度
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String s=str.substring(i, j);
                for(int x=0;x<s.length();x++){
                    for(int y=x+1;y<=s.length();y++){
                        String stmp=s.substring(x, y);
                        if(isHuiWen(stmp)){
                            len = stmp.length();
                        }
                        if(len > maxLen){
                            maxLen = len;
                            maxStr = stmp;
                        }
                        len = 0;
                    }}


            }
        }
        return maxStr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = new StringBuilder(s1).reverse().toString();
            int[][] dp = new int[s1.length() + 1][s2.length() + 1];
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    dp[i][j] = s1.charAt(i - 1) == s2.charAt(j - 1) ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            System.out.println(s1.length() - dp[s1.length()][s2.length()]);
        }
    }

}
