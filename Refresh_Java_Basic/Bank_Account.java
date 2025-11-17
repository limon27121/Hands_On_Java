package Refresh_Java_Basic;

public class Bank_Account {
    String Account_holder;
    double Balance;
    Bank_Account(String Account_holder,double Balance){
        this.Account_holder=Account_holder;
        this.Balance=Balance;
    }
    public void Deposit(double amount){
       Balance+=amount;
    }
    public void Withdraw(double amount){
        if (amount>Balance){
            System.out.println("insufficient Balance");
        }
        else {
            Balance-=amount;
            System.out.println("withdraw amount is: "+amount);
        }
    }
    
}
