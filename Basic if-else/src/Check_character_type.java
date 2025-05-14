//a digit (0-9)
//
//an uppercase letter (A-Z)
//
//a lowercase letter (a-z)
//
//or a special character (anything else)

import java.util.Scanner;

public class Check_character_type {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your input");
        char ch=sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println("new method");
        }
//        if(ch>='A' && ch<='Z'){
//            System.out.println("upper case");
//        }
        else if (ch>='a' && ch<='z') {
            System.out.println("lowercase");
        } else if (ch>='0' && ch<='9') {
            System.out.println("digit");
        }
        else {
            System.out.println("special character");
        }


    }
}
