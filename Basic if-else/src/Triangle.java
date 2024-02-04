import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        float first_angle,second_angle,third_angle;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your first angle");
        first_angle=scanner.nextFloat();
        System.out.println("enter your Second angle");
        second_angle=scanner.nextFloat();
        System.out.println("enter your third angle");
        third_angle=scanner.nextFloat();
        if(first_angle+second_angle>third_angle &&
                first_angle+third_angle>second_angle &&
                second_angle+third_angle>first_angle){

            System.out.println("Triangle is valid");
        }
        else {
            System.out.println("Triangle is invalid");
        }



    }
}
