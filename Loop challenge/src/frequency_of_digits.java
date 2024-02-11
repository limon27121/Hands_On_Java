import java.util.Scanner;
public class frequency_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] freq = new int[10];
        int number;
        int last_digit = 0;
        System.out.println("enter your number");
        number=scanner.nextInt();

        //initialize 0 to every item of loop
        for (int i=0;i<10;i++){
            freq[i]=0;
        }

        //calculate the freq of last digit
        while (number!=0){
            last_digit=number%10;
            number/=10;
            freq[last_digit]++;
        }
        //print the value of freq array
        for (int i=0;i<10;i++){
            System.out.println("freq of "+i +"is: "+freq[i]);
        }


    }
}
