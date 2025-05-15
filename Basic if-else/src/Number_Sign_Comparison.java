import java.util.Scanner;

public class Number_Sign_Comparison {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        num1=sc.nextDouble();
        System.out.println("enter your second number");
        num2= sc.nextDouble();
        System.out.println("enter your third number");
        num3= sc.nextDouble();
        if (num1>0 && num2>0 && num3>0){
            System.out.println("all numbers are positive");
        } else if (num1<0 && num2<0 && num3<0) {
            System.out.println("all numbers are negatives");
        }
        else {
            System.out.println("mixed numbers");
        }
    }
}
