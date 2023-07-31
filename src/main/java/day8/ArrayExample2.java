package day8;

import java.util.Arrays;
import java.util.Collection;

public class ArrayExample2 {
    public static void main(String[] args) {
        String data = "1,2,3,4,5,6,7,8,9,0";
        String[] arr = data.split(",");
        int[] numArr = new int[arr.length];
        for (int i = 0; i <= arr.length-1;i++){
            int ele = Integer.parseInt(arr[i]);
            numArr[i] = ele;
        }
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
