package day3;

public class AndStatementExample {
    public static void main(String[] args) {
        int a = 3, b =1,c =1;
        if (a > 1 || (b=2) > 10 || (c=5) > 20){
            System.out.println("printing numbers");
        }
        System.out.println(a+","+b+","+c);
    }
}
