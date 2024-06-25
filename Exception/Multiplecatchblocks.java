import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiplecatchblocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            System.out.print("Enter another integer to divide by: ");
            int divisor = scanner.nextInt();

            int result = number / divisor;
            System.out.println("Result: " + result);

            String str = null;
            System.out.println("Length of string: " + str.length());

        }
//        catch (InputMismatchException e) {
//            System.out.println("Caught InputMismatchException: Please enter a valid integer.");
//        } catch (ArithmeticException e) {
//            System.out.println("Caught ArithmeticException: Division by zero is not allowed.");
//        } catch (NullPointerException e) {
//            System.out.println("Caught NullPointerException: Attempted to access a null object.");
//        }

        catch (Exception e){
            System.out.println("handling exception");
            System.out.println(e.getMessage());
        }

    }
}
