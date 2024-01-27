
import java.util.Scanner;
class hello_world{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your name: ");
        String name=scanner.nextLine();
        System.out.print("enter your age: ");
        int age=scanner.nextInt();
        System.out.println(age);
        System.out.println(name);
        boolean agree=true;
        String greet="hello";
        int num1=10;
        int num2=20;
        int result=num1+num2;
        System.out.println(num1);
        System.out.println("num1 is:"+num1+" "+"num2 is:"+num2+" "+"sum is:"+result);
        System.out.println(greet);

    }
}