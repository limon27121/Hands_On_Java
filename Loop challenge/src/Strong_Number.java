import java.util.Scanner;
public class Strong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your Number");
        int number= sc.nextInt();
        find_strong_number(number);
    }
    public static void find_strong_number(int number){
        int sum=0,original_number=number;
       while (number!=0){
           int fact=1;
           int last_digit=number%10;
           for(int i=1;i<=last_digit;i++){
               fact*=i;
           }
           sum+=fact;
           number/=10;
       }
       if (original_number==sum){
           System.out.println("Given number is a strong number");
       }
       else {
           System.out.println("Given number isnot a strong number");
       }

    }
}
