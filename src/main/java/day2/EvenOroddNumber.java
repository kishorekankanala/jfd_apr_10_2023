package day2;

import java.util.Scanner;

public class EvenOroddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter required number :");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num +" is even");
        }
        else{
            System.out.println(num+"is odd");}
    }
}
