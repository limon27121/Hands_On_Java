//90–100: A
//
//80–89: B
//
//70–79: C
//
//60–69: D
//
//Below 60: F

import java.util.Scanner;

public class Gpa_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        double number=sc.nextDouble();
        if(number>=90 && number<=100){
            System.out.println("your grade is: A");
        } else if (number>=80 && number<=89) {
            System.out.println("your grade is: B ");
        } else if (number>=70 && number<=79) {
            System.out.println("your grade is: C");
        } else if (number>=60 && number<=69) {
            System.out.println("your grade is: D");
        } else if (number<60 && number>=0) {
            System.out.println("your grade is: F");
        }
        else {
            System.out.println("invalid input");
        }
    }
}
