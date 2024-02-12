import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any positive number");
        int number=scanner.nextInt();
        int result=fact(number);
        System.out.println("factorial of "+number+" is "+result);
    }
    public static int fact(int number){
        int factorial=1;
        for (int i=1;i<=number;i++){
            factorial*=i;
        }
        return factorial;
    }
}
