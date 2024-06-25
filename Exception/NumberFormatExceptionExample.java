public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int number = Integer.parseInt(str); // This will cause NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
