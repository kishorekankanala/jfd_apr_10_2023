package day7;

public class AccountManager {
    public static void main(String[] args) {

        Account account1 = new Account(1,"kishore",100000);
        account1.showDetails();
        Account account2 = new Account(3,"kankanala",300000);
        account2.showDetails();
        account2.deposit(2000);
        account2.showDetails();
    }
}
