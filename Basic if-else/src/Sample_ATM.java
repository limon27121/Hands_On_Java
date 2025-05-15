import java.util.Scanner;

public class Sample_ATM {
    public static void main(String[] args) {
        double withdraw,balance,charge=0.50;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your total balance");
        balance=sc.nextDouble();
        System.out.println("enter your desired withdraw amount");
        withdraw=sc.nextDouble();
        if(withdraw%5==0 && balance>=withdraw+charge){
            balance=balance-withdraw;
            System.out.println("your withdraw amount is: "+withdraw);
        }
        else {
            System.out.println("transaction failed");
        }
    }
}
