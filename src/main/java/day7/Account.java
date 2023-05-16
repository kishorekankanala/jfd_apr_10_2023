package day7;

public class Account {
    int accNum;
    String name;
    double balance;
    public Account(int accNum, String name, double balance){
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }
    public void withDraw(double amount){
        if(amount <= balance){
            balance = balance-amount;
        }else{
            System.out.println("you don't have sufficient amount");
        }

    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void showDetails(){
        System.out.println(accNum+" "+name+" "+balance);
    }
}
