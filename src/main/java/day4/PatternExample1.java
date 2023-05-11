package day4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class PatternExample1 {
    public static void main(String[] args) {
        System.out.println("enter given n number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for (int j =1 ;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static int sumOfTwoNumbers(int n){
        int sum =  (n*(n+1))/2;
        return sum;
    }
    public static LocalDateTime getSystemTime(){
        return LocalDateTime.now();
    }
    public static void showGreetings(String message){
        System.out.println(message);
    }
    public static void showDate(){
        System.out.println(LocalDateTime.now());
    }
}

