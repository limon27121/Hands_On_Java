package Array.assignment;

public class find_missing_number {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != i + 1) {
                System.out.println("Missing number is: " + (i + 1));
                break; // Exit loop after finding the missing number
            }
        }
    }
}
