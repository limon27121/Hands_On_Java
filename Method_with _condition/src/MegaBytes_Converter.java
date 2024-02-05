import java.util.Scanner;

public class MegaBytes_Converter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int Mb = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + Mb + " MB and " + kb + " KB");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input in kiloBytes: ");
        int input = scanner.nextInt();
        printMegaBytesAndKiloBytes(input);
    }
}

