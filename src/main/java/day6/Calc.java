package day6;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter first value ");
            int num1 = sc.nextInt();
            System.out.println("enter second number ");
            int num2 = sc.nextInt();
        System.out.println("input values are "+num1+" and "+num2);
        for(;;){
            System.out.println("1. addition, 2.subtractions, 3. multiplication, 4. division, 5.Quit");
            int ch = sc.nextInt();
            String res = "";
            switch (ch){
                case 1 : res = num1+" + "+num2+ " = "+(num1+num2);
                    break;
                case 2 : res = num1+" - "+num2+ " = "+(num1+num2);
                    break;
                case 3 : res = num1+" * "+num2+ " = "+(num1+num2);
                    break;
                case 4 : res = num1+" / "+num2+ " = "+(num1+num2);
                    break;
                case 5 :
                    System.exit(0);
                default :
                    System.out.println("enter valid number from 1 to 5");
            }
            System.out.println(res);
        }
    }

}
