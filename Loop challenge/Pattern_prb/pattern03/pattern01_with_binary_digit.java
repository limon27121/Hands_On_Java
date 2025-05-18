package Pattern_prb.pattern03;

import java.util.Scanner;

public class pattern01_with_binary_digit {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your desired number");
        number = sc.nextInt();
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= row; col++) {
               if (col%2==0){
                   System.out.print("0");
               }
               else {
                   System.out.print("1");
               }
            }
            System.out.println();
        }
        for (int row = number; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
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
