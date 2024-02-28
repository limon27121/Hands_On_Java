import java.util.*;
import java.lang.String;

class Account1{

    private long account_number;
    private String account_holder_name;
    private double amount;



    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public double getAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder Name:");
        String Name = sc.nextLine();
        System.out.println("Enter Account Number");
        long acc_no=sc.nextLong();
        if(Name.equals(account_holder_name)&& acc_no==account_number){
            System.out.println("amount is: "+amount);
        }
        else {
            System.out.println("Invalid Information");
        }

        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    }




public class Encapsulation_exm {
    public static void main(String[] args) {
        Account1 acc=new Account1();
        acc.setAccount_holder_name("limon");
        acc.setAccount_number(171060);
        acc.setAmount(5000);
        acc.getAmount();

    }
}
