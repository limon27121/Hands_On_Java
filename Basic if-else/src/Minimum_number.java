import java.util.Scanner;
public class Minimum_number {
    //using methods
    public static int minimum(int num1,int num2,int num3){
       if(num1<num2){
        if(num1<num3){
            return num1;
        }
        return num3;
       }

       else{
        if(num2<num3){
            return num2;
        }
        else{
            return num3;
        }
       }
                    
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your 1st Number");
        int num1=scanner.nextInt();
        System.out.println("enter your second number");
        int num2=scanner.nextInt();
        System.out.println("enter your 3rd number");
        int num3=scanner.nextInt();
        int res=minimum(num1,num2,num3);
        System.out.println("Minimum number is: "+res);
        scanner.close();
    }
}
