package day1;

import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the required number: ");
        int num = sc.nextInt();
        for(int i = 1;i<=20;i++){
            System.out.println(String.format("%s * %s = %s",num,i,num * i));
        }
        for(int i = 19; i>=1;i--){
            System.out.println(String.format("%s * %S = %s",num,i,num*i));
        }
    }
}
