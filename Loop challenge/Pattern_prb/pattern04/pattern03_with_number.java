package Pattern_prb.pattern04;

import java.util.Scanner;

public class pattern03_with_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter your number");
        number=sc.nextInt();
        //upper part
        for (int row=1;row<=number;row++){
            for (int col=1;col<=number-row;col++){
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                System.out.print(""+col);
            }
            System.out.println();
        }
        //lower part
        for (int row=number-1;row>=1;row--){
            for (int col=1;col<=number-row;col++){
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                System.out.print(""+col);
            }
            System.out.println();
        }


    }
}
