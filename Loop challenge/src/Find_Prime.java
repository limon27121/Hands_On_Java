import java.util.Scanner;
public class Find_Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your range");
        int limit=sc.nextInt();
        if (limit<2){
            System.out.println("invalid range");
        }
        else {
            prime(limit);
        }


    }
    public static void prime(int limit){
        int sum=0;
        for (int j=2;j<=limit;j++){
            int is_prime=1;

            for (int i=2;i<=j/2;i++){
                if (j%i==0){

                    is_prime=0;
                    break;
                }
            }

            if (is_prime==1) {
                System.out.println("prime number is: " +j);
                 sum+=j;
            }
        }
        System.out.println("sum of prime number: "+sum);
    }

}
