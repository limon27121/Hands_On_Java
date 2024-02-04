//    req of salary

//    Basic Salary <= 10000 : HRA = 20%, DA = 80%
//    Basic Salary is between 10001 to 20000 : HRA = 25%, DA = 90%
//    Basic Salary >= 20001 : HRA = 30%, DA = 95%


import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float salary,HRA = 0,DA=0,total_salary=0;
        System.out.println("enter your salary");
        salary=scanner.nextFloat();
        if (salary<=10000){
            HRA= (float) (salary*0.2);
            DA= (float) (salary*0.8);

        }
        else if (salary>10000&&salary<=20000) {
            HRA= (float) (salary*0.25);
            DA= (float) (salary*0.9);

        }
        else if (salary>20000) {
            HRA= (float) (salary*0.30);
            DA= (float) (salary*0.95);

        }
        else {
            System.out.println("invalid operation");
        }

        total_salary=salary+HRA+DA;
        System.out.println("Gross salary is : "+total_salary);
    }





}
