import java.util.Scanner;
public class Find_Lcm {
    public static void main(String[] args) {
        Scanner scnanner=new Scanner(System.in);
        System.out.println("Enter Your 1st Number");
        int num1=scnanner.nextInt();
        System.out.println("enter Your 2nd Number ");
        int num2=scnanner.nextInt();
        int lcm = (num1 > num2) ? num1 : num2;

        // Always true
        while(true) {
            if( lcm % num1 == 0 && lcm % num2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            ++lcm;
        }
    }

}
