package day7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExamples {
    public static void main(String[] args) {
    int [] arr = new int[10];
    for(int i =0;i<arr.length;i++){
        arr[i] = ThreadLocalRandom.current().nextInt(10,20);

    }
    int sum = 0;
    for( int i = 0; i < arr.length; i++){
        sum = sum+arr[i];
    }
        System.out.println(Arrays.toString(arr));
    System.out.println("sum of numbers is "+sum);
    double ave = sum/(double)arr.length;
        System.out.println("average of numbers is "+ave);
        String[] names = new String[]{"kishore","kishore","kankanala","pavan","sai"};
        System.out.println(names.length);
        for (int i = names.length-1;i>=0;i--){
            String name = names[i];
            System.out.println(" " +name);
        }
    }
}
