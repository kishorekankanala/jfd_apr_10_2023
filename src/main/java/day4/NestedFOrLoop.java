package day4;

import java.util.Scanner;

public class NestedFOrLoop {
    public static void main(String[] args) {
        System.out.println("Enter upto no of tables printed ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j = 1; j<=n ;j++){
            int num =j;
            for(int i=1; i<=10;i++){
                System.out.println(num+"*"+i+"="+num*i);
            }
            System.out.println("next table ----------------");
        }
    }
}
