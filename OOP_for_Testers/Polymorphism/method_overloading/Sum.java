package OOP_for_Testers.Polymorphism.method_overloading;

public class Sum {

    int a;
    int b;

    void sum(){
        System.out.println("your sum is:"+(a+b));
    }

    void sum(int a,int b){
        int sum=a+b;
        System.out.println("your sum is:"+sum);
    }

    void sum(double a,double b){
        double sum=a+b;
        System.out.println("your sum is:"+sum);
    }

}
