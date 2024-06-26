package prb_solving_of_string;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String s1=sc.nextLine();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println("reverse the string: "+s2);
    }

}
