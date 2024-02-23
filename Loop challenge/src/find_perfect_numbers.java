import java.util.Scanner;
public class find_perfect_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your limit");
        int range= sc.nextInt();
        find_result(range);
    }
    public static void find_result(int number){


        for (int j=1;j<=number;j++){
            int sum=0;
            for (int i=1;i<=j/2;i++){
                if(j%i==0){
                    sum+=i;
                }
            }
            if (sum==j){
                System.out.println("perfect number:"+j);
            }
        }

    }
}
