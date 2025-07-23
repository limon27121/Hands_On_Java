package Array.assignment;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={1,2,3,4,5,6,7,8};
        System.out.print("enter your number: ");
        int num=sc.nextInt();
        for (int x:arr1){
            if (x==num){
                System.out.println("element matched");
                break;
            }
        }
        System.out.println("element not found");

    }
}
