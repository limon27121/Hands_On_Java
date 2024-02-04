//For first 50 units Rs. 0.50/unit
//        For next 100 units Rs. 0.75/unit
//        For next 100 units Rs. 1.20/unit
//        For unit above 250 Rs. 1.50/unit
//        An additional surcharge of 20% is added to the bill.

import java.util.Scanner;
public class Electricity_bill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float unit=0,bill_amount=0;
        System.out.println("enter your consumed unit");
        unit=scanner.nextFloat();
        if(unit<=50){
            bill_amount= (float) (unit*0.50);
        } else if (unit<=150) {
            bill_amount= (float) (25+((unit-50)*0.75));
        }
        else if (unit<=250){
            bill_amount= (float) (100+((unit-150)*0.75));
        } else if (unit>250) {
            bill_amount= (float) (220+((unit-250)*0.75));
        }
        float surcharge= (float) (bill_amount*0.2);
        float total_bill=bill_amount+surcharge;
        System.out.println("total bill is: "+total_bill+" taka");
    }

}
