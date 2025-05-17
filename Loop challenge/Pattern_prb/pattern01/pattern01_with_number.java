//1
//12
//123
package Pattern_prb.pattern01;

import java.util.Scanner;

public class pattern01_with_number {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your desired number");
        number= sc.nextInt();
        for (int row=1;row<=number;row++){
            for (int col=1;col<=row;col++){
                System.out.print(""+col);
            }
            System.out.println();
        }
    }
}
