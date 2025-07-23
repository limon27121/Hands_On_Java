package Array.assignment;

import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,8,8};
        System.out.print("enter your value:");
        int num=sc.nextInt();
        int count=0;
        for (int x:arr){
            if (x==num){
                count+=1;
            }
        }
        System.out.println("count of the number:"+count);
    }
}
