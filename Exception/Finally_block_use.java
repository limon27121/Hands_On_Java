import java.util.Scanner;

public class Finally_block_use {
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
        finally {
            System.out.println("finally block is excuted");
        }
    }
}



//case01:exception occured,catch block handled => finally block will excuted
//case02:exception occured,catch block not handled => finally block will excuted
//case03:exception doesnot occured,catch block ignored => finally block will excuted


