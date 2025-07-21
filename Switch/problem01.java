package Switch;

import java.util.Scanner;

public class problem01 {
    public static void main(String[] args) {
        System.out.println("enter your input");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        switch (input){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("satuerday");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
