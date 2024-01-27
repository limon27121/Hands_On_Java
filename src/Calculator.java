import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      float Number1=0;
      float Number2=0;
      float result=0;
      String sign="";
      System.out.println("enter your first number");
        Number1=scanner.nextFloat();
        System.out.println("enter your second number ");
        Number2=scanner.nextFloat();
        System.out.println("enter your choice between +,-,*,/,%");
        sign=scanner.next();
        if(sign.equals("+")) {
            result = Number1 + Number2;
        }
        else if (sign.equals("-")) {

            result = Number1 - Number2;
        }
        else if (sign.equals("*")) {

            result = Number1 * Number2;
        }
        else if (sign.equals("/")) {
            result=Number1/Number2;

            }

        else if (sign.equals("%")) {

            result = Number1 % Number2;
        }
        else {
            System.out.println("invalid input");
        }

        System.out.println("result is : "+result);


    }
}
