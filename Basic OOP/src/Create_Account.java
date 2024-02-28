import java.lang.String;
//blue print of object
class Account{
    int acc_no;
    String name;
    float amount;

    //here is function
    public static void print(){
        System.out.println("i am function");
    }
    //here is method
//    void initialize(int a,String n,float am){
//        acc_no=a;
//        name=n;
//        amount=am;
//    }
    //here is constructor
    Account(int acc_no,String name,float amount){
        this.acc_no=acc_no;
        this.name=name;
        this.amount=amount;
    }
   //here is method
    void deposit(float amt){
        amount+=amt;
        System.out.println(" Total amount is: "+amount);
    }
    void withdraw(float amt){
        if (amount>amt){
            amount-=amt;
            System.out.println("withdrawal amount is: "+amt);
        }
        else {
            System.out.println("insufficient balance");
        }
    }
    void display(){
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Total Amount: " + amount);
        print();

    }
    void check_balance(){
        System.out.println("total balance is: "+amount);
    }


}


public class Create_Account {
    public static void main(String[] args) {
        //create object
        Account ac1=new Account(11221,"limon",500000);

        ac1.display();
        ac1.check_balance();
        ac1.deposit(4000);
        ac1.check_balance();
        ac1.withdraw(4000);
        ac1.check_balance();;


    }
}
