package day3;

import java.util.Scanner;

public class FactorsOfGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter given N value :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
                count++;
            }
        }
        if (count == 2) {
            System.out.println("given number is prime ");
        } else {
            System.out.println("this number is not a prime");
        }
    }
}
