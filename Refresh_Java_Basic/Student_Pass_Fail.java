package Refresh_Java_Basic;
import java.util.Scanner;
public class Student_Pass_Fail {
    public static double[] Taking_Input(){
    Scanner sc=new Scanner(System.in);
    double[]marks=new double[3];
        System.out.print("enter your first number: ");
        marks[0]=sc.nextDouble();
        System.out.print("enter your second number: ");
        marks[1]=sc.nextDouble();
        System.out.print("enter your third number: ");
        marks[2]=sc.nextDouble();
        return marks;
    }
    public static double Calculate_avg(double[]marks){
        double sum=0;
        for (double m:marks){
            sum+=m;
        }
        return sum/marks.length;
    }
    public static void Show_result(double avg){
       if(avg>=40){
           System.out.println("pass");
       }
       else {
           System.out.println("fail");
       }
    }
    public static void main(String[] args) {
         double[]marks=Taking_Input();
         double avg=Calculate_avg(marks);
         Show_result(avg);
    }
}
