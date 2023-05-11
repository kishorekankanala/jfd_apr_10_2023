package day5;

public class Numberoperation {
    public static void main(String[] args) {
        int num = 153;
        //int sum = sumOfDigits(num);
        int rev = reverse(num);
        System.out.println("sum of digits "+num+" is "+sumOfDigits(num));
        System.out.println(num+" is palindrome "+isPalindrome(num));
        System.out.println("reverse number is "+num+" is "+rev);
        System.out.println(num+"is armstrong "+isArmstrong(num));
    }


    public static int sumOfDigits(int num) {
        int sum = 0;
        while ((num != 0)) {
            int r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        return sum;

    }
    public static boolean isArmstrong(int num){
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int r = temp%10;
            sum = sum +(r*r*r);
            temp = temp/10;
        }
        return num ==sum;
    }

    public static int reverse(int num) {
        int rev = 0;
        while ((num != 0)) {
            int r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }
}
