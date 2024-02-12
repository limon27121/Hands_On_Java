import java.util.Scanner;
public class find_gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int first_number=scanner.nextInt();
        System.out.println("enter second number");
        int second_number=scanner.nextInt();
        int result=gcd(first_number,second_number);
        int result1=Euclidean_Algorithm(first_number,second_number);
        System.out.println("result is: "+result);
        System.out.println("Euclidean_Algorithm result is: "+result1);
    }
    public static int gcd(int num1,int num2){
        int min=(num1>num2)?num2:num1;
        int gcd=1;
        for (int i=1;i<=min;i++){
            if (num1%i==0&&num2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int Euclidean_Algorithm(int num1,int num2){
        int rem=1,max,min;
        max=(num1>num2)?num1:num2;
        min=(num1>num2)?num2:num1;
        while (max%min!=0){
            rem=max%min;
            max=min;
            min=rem;
        }
        return rem;

    }

}
