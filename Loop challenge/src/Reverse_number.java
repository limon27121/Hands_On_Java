import java.util.Scanner;
public class Reverse_number {
    public static void main(String[] args) {
        boolean is_palindrome=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Your Number");
        int number=scanner.nextInt();
        int reverse=reverse_number(number);
        is_palindrome=palindrome(number);
        if (is_palindrome==true){
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }

        System.out.println("reverse number is : "+reverse);

    }
    public static int reverse_number(int number){
        int reverse=0;
        while (number!=0){
            reverse=(reverse*10)+number%10;
            number/=10;
        }
        return reverse;
    }
    public static boolean palindrome(int number){
        boolean is_palindrome=false;
       int reverse=reverse_number(number);
       if (reverse==number){
           is_palindrome = true;
       }
       else {
           is_palindrome=false;
       }
       return is_palindrome;
    }

}
