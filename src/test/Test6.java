package test;

public class Test6 {
public static void main(String args[]){
    int num = 2;
    switch (num) {
        case 1:
            ++num;
        case 2:
            ++num;
        case 3:
            ++num;
        default:
            ++num;
            break;
    }
    System.out.println(num);
    }
}