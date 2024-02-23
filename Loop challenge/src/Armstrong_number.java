import java.util.Scanner;
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your Number");
        int number=sc.nextInt();
        find_result(number);
    }
    public static void find_result(int number){
        int count=0;
        int sum=0;
        int number1=number;
        int original_number=number;
        //find the number of digits
        while (number!=0){
            int last_digit=number%10;
            count++;
           number/=10;
        }


  //find the last digit and calculate power of last digit with num of digit
       while (number1!=0){
           int last_digit=number1%10;
           int power_number= (int) Math.pow(last_digit,count);
           sum+=power_number;
           number1/=10;
       }


       if(sum==original_number){
           System.out.println("Armstrong number");
       }
       else {
           System.out.println("Not Armstrong number ");
       }

    }
}
