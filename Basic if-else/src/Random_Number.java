public class Random_Number {
    public static void main(String[] args) {
        int max_Range = 99;
        int min_Range = 1;

        int random_Number = min_Range + (int)(Math.random() * (max_Range - min_Range + 1));

        System.out.println("Random number is: " + random_Number);
    }
}
