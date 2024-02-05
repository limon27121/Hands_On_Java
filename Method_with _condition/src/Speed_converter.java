import java.util.Scanner;
public class Speed_converter {
    public static long toMilesPerHour(double kilometersPerHour) {
             if(kilometersPerHour<0){
                 return -1;
             }
             else {
                 double miles_per_hour = kilometersPerHour / 1.609;
                 long rounded_miles_per_hour=Math.round(miles_per_hour);
                 return rounded_miles_per_hour;
             }

    }

    public static void printConversion (double  kilometersPerHour) {
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else {
            long rounded_miles_per_hour=toMilesPerHour( kilometersPerHour);
            System.out.println(" "+kilometersPerHour+"Km/h"+"="+" "+rounded_miles_per_hour+"mi/h");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your input in kilometersPerHour");
        double input=scanner.nextFloat();
       printConversion(input);
    }
}
