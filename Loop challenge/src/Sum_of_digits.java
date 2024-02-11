import java.util.Scanner;
public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        int number=scanner.nextInt();
        int sum=Sum_of_digit(number);
        System.out.println("Sum digits are: "+sum);
  }
    public static int Sum_of_digit(int number){
        int sum=0;
        while (number!=0){
            int last_digit=number%10;
            sum+=last_digit;
            number/=10;
        }

        return sum;
    }
}
