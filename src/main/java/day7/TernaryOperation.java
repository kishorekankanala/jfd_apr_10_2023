package day7;

public class TernaryOperation {
    public static void main(String[] args) {
        int n1 =30;
        int n2 = 20;
        int n3 = 25;
        int big;
        big = (n1>n2 && n1>n3)? n1:(n2>n3)?n2:n3;
        System.out.println(big);
    }

}
