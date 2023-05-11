package day4;

public class ContinueExample1 {
    public static void main(String[] args) {
        for (int i =2;i<=20; i = i+2 ){
            if (i%5 == 0){
                break;
            }
            System.out.println(i);
        }
    }
}
