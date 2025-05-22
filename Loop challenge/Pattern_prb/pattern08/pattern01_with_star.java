package Pattern_prb.pattern08;

import java.util.Scanner;

public class pattern01_with_star {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        number= sc.nextInt();
        for (int row=1;row<=number;row++){
            for (int col=1;col<=number-row;col++){
                System.out.print(" ");
            }
            for (int col=1;col<=(row*2)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row=number-1;row>=1;row--){
            for (int col=1;col<=number-row;col++){
                System.out.print(" ");
            }
            for (int col=1;col<=(row*2)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
