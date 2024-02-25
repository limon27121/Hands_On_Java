import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Your term");
        int term= sc.nextInt();
        find_fibonacci(term);
    }
    public static void find_fibonacci(int term){
        int a=0,b=1,c=0;
        for (int i=1;i<=term;i++){
            System.out.print(c + ",");
            a=b;
            b=c;
            c=a+b;

        }
    }
}
