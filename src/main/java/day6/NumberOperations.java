package day6;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.sum of numberes, 2. sum of digits, 3. fibioacci , 4. exit");
            int ch = sc.nextInt();
            switch (ch){
                case 1 :
                    System.out.println("enter the number dor sum of numbers");
                    int ab = sc.nextInt();
                    System.out.println("sum of given number is "+sumOfNumbersForLoop(ab));
                    break;
                case 2 :
                    System.out.println("enter the number for sum of digits");
                    int x = sc.nextInt();
                    System.out.println("sum of given number is "+sumOfDigitsWhile(x));
                    break;
                case 3 :
                    System.out.println("enter the number for fibioaaci");
                    int y = sc.nextInt();
                    System.out.println("sum of given number is "+fibonacciTeam(y));
                    break;
                case 4 :
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("enter valid input from 1 to 3");
            }
        }

    }

    public static int sumOfNumbersForLoop(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;

        }
        return sum;
    }
    public static int sumOfDigitsWhile(int num){
        int sum = 0;
        while(num !=0){
            int r = num % 10;
            sum = sum+r;
            num = num/10;

        }
        return sum;
    }
    public static int fibonacciTeam(int num){
        if(num == 1){
            return 0;
        }else if( num ==2 || num == 3){
            return 1;
        }else {
            int a =0 , b= 1;
            for(int i =2;i<=num;i++){
                int sum = a+b;
                a =b;
                b = sum;
            }return b;
        }
    }
}