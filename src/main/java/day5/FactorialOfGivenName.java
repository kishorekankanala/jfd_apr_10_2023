package day5;

public class FactorialOfGivenName {
    public static void main(String[] args) {
        int num = 6;
        int res = factorial(num);
        System.out.println("factorial of " + num + " is " + res);
        int n = 10;
        int sum = sumOfTwoOddNumbers(n);
        System.out.println("sum of first " + n + " odd are " + sum);
    }


    public static int factorial(int num) {
        int fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static int sumOfTwoOddNumbers(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
