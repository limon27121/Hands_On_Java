package Switch;

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        double result;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your first number:");
        double num1= sc.nextDouble();
        System.out.print("enter your second number:");
        double num2= sc.nextDouble();
        System.out.print("enter your choice:");
        String choice=sc.next();
        switch (choice){
            case "+":
                result=num1+num2;
                System.out.println(result);
                break;
            case "-":
                if (num1>num2){
                    result=num1-num2;
                }
                else {
                    result=num2-num1;
                }
                System.out.println(result);
                break;
            case "*":
                result=num1*num2;
                System.out.println(result);
                break;
            case "/":
                result=num1/num2;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid input");
                break;
        }

    }
}
