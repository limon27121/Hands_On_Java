package Array.assignment;

public class problem02 {
    public static void main(String[] args) {
        double arr1[]={1,3,45,34,45};
        for (double x:arr1){
            if (x%2==0){
                System.out.println("even numbers are: "+x);
            }
            else {
                System.out.println("odd numbers are: "+x);
            }
        }
    }
}
