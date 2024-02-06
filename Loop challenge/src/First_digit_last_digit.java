import java.util.Scanner;
public class First_digit_last_digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int number = scanner.nextInt();
        int last_digit=number%10;
        int first=number;
        while (first>=10){
            first/=10;
        }
        System.out.println("first digit: "+first+" last digit: "+last_digit);


    }
}
