package Pattern_prb.pattern10;

import java.util.Scanner;

public class pattern01_with_star {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        number= sc.nextInt();
        for (int row=1;row<=number;row++){
            for (int col=1;col<=number;col++){
                if(row==1 || row==number|| col==1 || col==number){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
