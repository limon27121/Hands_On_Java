//0–12: Child
//
// 13–19: Teen
//
// 20–59: Adult
//
//60+: Senior


import java.util.Scanner;

public class Age_Group_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age: ");
        float age=scanner.nextFloat();
       if(age>=0 && age<=12){
           System.out.println("child");
       }
       else if (age>=13 && age<=19) {
           System.out.println("teen");

       } else if (age>=20 && age<=59) {
           System.out.println("adult");
       } else if (age>=60) {
           System.out.println("senior");
       }
       else {
           System.out.println("invalid age");
       }
    }
}
