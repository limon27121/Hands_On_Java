package Pattern_prb.pattern06;

import java.util.Scanner;

public class pattern01_with_number {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        number= sc.nextInt();
        for (int row=1;row<=number;row++){
            for ( int col=1;col<=row;col++){
                System.out.print(""+(row*col));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
