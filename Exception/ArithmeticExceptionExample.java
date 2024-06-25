import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();

        try {
            int result = inputInt/ 0; // This will cause ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }



    }
}
