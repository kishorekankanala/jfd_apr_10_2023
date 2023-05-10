package day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumAndAvgOfThreeInputs {
    public static void main(String[] args) {
        System.out.println("Enter first input :");
        Scanner sc = new Scanner(System.in);
        float value1 = sc.nextFloat();
        System.out.println("Enter second input :");
        float value2 = sc.nextFloat();
        System.out.println("Enter third input :");
        float value3 = sc.nextFloat();
        int noofvalues = 3;
        float sum = value1+value2+value3;
        float avg = sum/noofvalues;
        System.out.println("sum of values "+sum);
        System.out.println("avg of values :-"+ avg);

    }
}
