import java.util.Scanner;
public class Swap_firstdigit_lastdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int number=scanner.nextInt();
        int swaped_number=swaped_number(number);
        System.out.println("swapped Number: "+swaped_number);
    }
    public static int swaped_number(int number){
        //convert int to string
        java.lang.String numStr = Integer.toString(number);

        if(numStr.length()>1) {
            char first_digit = numStr.charAt(0);
            char last_digit = numStr.charAt(numStr.length() - 1);
           String middle_digits = numStr.substring(1, numStr.length() - 1);
           String swappedNumStr =   last_digit+middle_digits +first_digit;
            return Integer.parseInt(swappedNumStr);
        }

        else {
            return number;
        }

    }
}
