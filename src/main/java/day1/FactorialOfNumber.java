package day1;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num = 9;
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        System.out.println("factorial " + num + " is " + res);
    }
}
