package day1;

public class MultiplicationOfTable {
    public static void main(String [] args){
        int a = 20;
        for(int i = 1;i<=20;i++){
            System.out.println(String.format("%s * %s = %s",a,i,a*i));
        }
    }
}
