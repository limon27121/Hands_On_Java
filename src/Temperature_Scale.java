import java.util.Scanner;
public class Temperature_Scale {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float Celsius=0,Fahrenheit=0;
        int Opition=0;
        System.out.println("enter your options,option1=Fahrenheit,opition2=Celsius: ");
        Opition=scanner.nextInt();
        if(Opition==1){
            System.out.println("enter Your temperature in Celsius scale");
            Celsius=scanner.nextFloat();
            Fahrenheit=((9*Celsius)/5)+32;
            System.out.println("Temperature in Fahrenheit scale is: "+Fahrenheit);
        }
        else if (Opition==2) {
            System.out.println("enter Your temperature in Fahrenheit scale");
            Fahrenheit=scanner.nextFloat();
            Celsius= (float) ((Fahrenheit - 32) * (5.0/9.0));
            System.out.println("Temperature in Celsius scale is: "+Celsius);
        }
        else {
            System.out.println("invalid Opition");
        }

    }
}
