import java.util.Scanner;
public class Maximum_numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float num1,num2,num3;
        System.out.println("enter Your 1st number");
        num1=scanner.nextFloat();
        System.out.println("enter Your 2nd number");
        num2=scanner.nextFloat();
        System.out.println("enter Your 3rd number");
        num3=scanner.nextFloat();

        if(num1>num2){
            if (num1>num3){
                System.out.println("maximum number is: "+num1);
            }
            else {
                System.out.println("maximum number is: "+num3);
            }
        }
        else {
            if (num2>num3){
                System.out.println("maximum number is: "+num2);
            }
            else {
                System.out.println("maximum number is: "+num3);
            }
        }
    }
}
