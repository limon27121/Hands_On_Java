import java.util.Scanner;

public class Random_phoneNumber {
    public static void main(String[] args) {
        try {
            Scanner input=new Scanner(System.in);
            System.out.print("enter your base number:");
            String base_num=input.next();
            int max_Range =99999999;
            int min_Range =10000000;

            int random_Number = min_Range + (int)(Math.random() * (max_Range - min_Range + 1));
            String random_phone_number= base_num+random_Number;
            System.out.println("Random phone number is:" + random_phone_number);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("code run sucessfully");
        }

    }
}
