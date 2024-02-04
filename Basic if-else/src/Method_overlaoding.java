public class Method_overlaoding {

    public static double convertToCentimeters(double total_result){
      
        return total_result*2.54;
    }
    public static double convertToCentimeters(int foot,int inches){
         foot*=12;
         double total_inches=foot+inches;
         double result= convertToCentimeters(total_inches);
         return result;
         
            
    }
    public static void main(String[] args) {
        double result=convertToCentimeters(5);
        double result1=convertToCentimeters(5,8);
        System.out.println("convert inches to centimeter: "+result+" "+"cm");
        System.out.println("convert foot and inches to centimeter: "+result1+" "+"cm");
    }
    
}
