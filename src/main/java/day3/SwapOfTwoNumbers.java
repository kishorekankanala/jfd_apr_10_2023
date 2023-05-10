package day3;

public class SwapOfTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int tmp = a;
        System.out.println("before swap a = "+a+", b ="+b);
        a = b;
        b = tmp;
        System.out.println("after swap a ="+a+", b ="+b);
    }
}
