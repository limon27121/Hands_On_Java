import java.util.Scanner;
public class Result_Sheet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float bang=0,eng=0,phy=0,chem=0,ict=0;
        float avg=0,percentage=0;
        System.out.println("enter Your marks in Bangla: ");
        bang=scanner.nextFloat();
        System.out.println("enter Your marks in English: ");
        eng=scanner.nextFloat();
        System.out.println("enter Your marks in Physics: ");
        phy=scanner.nextFloat();
        System.out.println("enter Your marks in Chemistry: ");
        chem=scanner.nextFloat();
        System.out.println("enter Your marks in Ict: ");
        ict=scanner.nextFloat();
        float sum=bang+eng+phy+chem+ict;
        avg=sum/5;
        percentage=(sum/500)*100;
        System.out.println("avg number is: "+avg);
        System.out.println("percentage number is: "+percentage+"%");

        if (avg>80){
            System.out.println("Gpa is: A+");
        } else if (avg>=69&&avg<=79) {
            System.out.println("Gpa is: A");
        } else if (avg>=59&&avg<69) {
            System.out.println("Gpa is: A-");
        } else if (avg>=49&&avg<59) {
            System.out.println("Gpa is: B+");
        } else if (avg>=33&&avg<49) {
            System.out.println("Gpa is: B");
        } else if (avg<33) {
            System.out.println("fail");
        }
        else {
            System.out.println("invalid operations");
        }


    }
}
