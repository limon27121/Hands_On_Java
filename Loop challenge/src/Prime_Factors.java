import java.util.Scanner;
public class Prime_Factors {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
      int number= sc.nextInt();
      factors(number);
    }
    public static void factors(int number){

        for (int i=2;i<=number;i++){
            int is_prime=1;
            if (number%i==0){
                for (int j=2;j<=i/2;j++){

                    if (i%j==0){
                        is_prime=0;
                        break;
                    }
                }
                if (is_prime==1){
                    System.out.println("prime factors is: "+i);
                }
            }

        }
    }
}
