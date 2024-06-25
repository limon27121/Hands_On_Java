public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            str.length(); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
