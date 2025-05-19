package Pattern_prb.pattern04;

import java.util.Scanner;

public class pattern01_with_binary_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("enter your desired number: ");
        number=sc.nextInt();
        for (int row=1;row<=number;row++){
            for (int col=1;col<=number-row;col++){
                System.out.print(" ");
            }
            for (int col=1;col<=row;col++){
                if (col%2==0){
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
