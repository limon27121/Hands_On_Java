//Functionalities:
//Check Balance
//
//Deposit Money
//
//Withdraw Money
//
//Exit

import java.util.Scanner;

public class ATM_System {
    public static void main(String[] args) {
      float Balance=1000,Deposit_Money,Withdraw_Money;
      int choice;
      while (true){
          System.out.println("----- ATM MENU -----");
          System.out.println("1. Check Balance");
          System.out.println("2. Deposit Money");
          System.out.println("3. Withdraw Money");
          System.out.println("4. Exit");
          Scanner sc=new Scanner(System.in);
          System.out.print("enter your choice: ");
          choice=sc.nextInt();
          if (choice==1){
              System.out.print("your current balance is: "+Balance);
          }

          else if (choice==2) {
              System.out.print("enter your desired deposit amount");
              Deposit_Money=sc.nextFloat();
              if(Deposit_Money>0){
                  Deposit_Money+=Deposit_Money;
                  Balance+=Deposit_Money;
                  System.out.println("your deposit is successfully finished");
              }
              else {
                  System.out.println("invalid deposit amount");
              }
          } else if (choice==3) {
              System.out.print("enter your withdraw amount: ");
              Withdraw_Money=sc.nextFloat();
              if (Withdraw_Money>0){
                  if (Withdraw_Money<Balance+0.50 && Withdraw_Money%5==0 ){
                      Balance= Balance-(float) ((Withdraw_Money+0.50));
                      System.out.print("your updated balance is: "+Balance);
                  }
                  else {
                      System.out.println("Transaction Failed");
                  }
              }
              else {
                  System.out.println("invalid amount");
              }
          }
          else if (choice==4) {
              System.out.println("Thank you for using the ATM. Goodbye!");
              break;
          }
          else {
              System.out.println("invalid choice");
          }


      }
      }

}
