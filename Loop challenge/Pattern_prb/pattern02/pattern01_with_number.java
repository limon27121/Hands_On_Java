package Pattern_prb.pattern02;

import java.util.Scanner;

public class pattern01_with_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("enter your desired number: ");
        number= sc.nextInt();
        for (int row=number;row>0;row--){
            for (int col=1;col<=row;col++){
                System.out.print(""+col);
            }
            System.out.println();
        }
    }
}
