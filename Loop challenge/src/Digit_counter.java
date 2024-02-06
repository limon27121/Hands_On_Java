
import java.util.Scanner;
public class Digit_counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");

        // Read the user's input
        int number = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        int counter = 0;

        while (number != 0) {
            counter++;
            number /= 10;


        }

        System.out.println("Number of digits: " + counter);
    }
}
