package Array.assignment;

import java.util.Scanner;

public class Days_of_the_week {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week");
        int day=input.nextInt();
        System.out.println(week[day-1]);
    }
}
