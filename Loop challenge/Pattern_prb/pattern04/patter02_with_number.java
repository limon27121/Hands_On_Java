package Pattern_prb.pattern04;

import java.util.Scanner;

public class patter02_with_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your desired number");
        int number;
        number=sc.nextInt();
        for (int row=number;row>=1;row--){
            for (int col=1;col<=number-row;col++){
                System.out.print("");
            }
            for (int col=1;col<=row;col++){
                System.out.print(""+col);
            }
            System.out.println();
        }
    }
}
