package OOP_for_Testers.encapculation;

public class Bank {
    private int account_number;
    private String name;
    private double amount;

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getAccount_number() {
        return account_number;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
