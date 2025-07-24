package Array.assignment;


import java.util.Scanner;

//*
//        * Create a program that allows a user to enter any
// * number of grades and provides them with their
// * average score, as well as the highest and lowest scores.
// *
public class Grades {
    private static int grades[];
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter you expected number of grades");
        Scanner sc=new Scanner(System.in);
        grades=new int[sc.nextInt()];
        GetGrades();
        double avg=avg();
        System.out.println("avg score:"+avg);
        System.out.println("maximum score is: "+max());
        System.out.println("minimum score is: "+min());
    }
    public static void  GetGrades(){
        for (int i = 0; i < grades.length ; i++) {
            System.out.print("enter your marks:");
            grades[i]=sc.nextInt();
        }
    }

    public static double sum(){
        double sum=0;
        for (int x:grades){
            sum+=x;
        }
        return sum;
    }

    public static double avg(){
        double avg_num=sum()/grades.length;
        return avg_num;
    }

    public static double max(){
        double max=grades[0];
        for (int i = 0; i <grades.length ; i++) {
            if (grades[i]>max){
                max=grades[i];
            }
        }
        return max;
    }

    public static double min(){
        double min=grades[0];
        for (int i = 0; i <grades.length ; i++) {
            if (grades[i]<min){
                min=grades[i];
            }
        }
        return min;
    }


}
