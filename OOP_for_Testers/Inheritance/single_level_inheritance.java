package OOP_for_Testers.Inheritance;

class A{
    int a=50;
    void display(){
        System.out.println(a);
    }
}

class B extends A{
    int b=60;
    void sum(){
        int sum=super.a+b;
        System.out.println("sum is:"+sum);
    }
}

public class single_level_inheritance {
    public static void main(String[] args) {
        B b1=new B();
        b1.sum();
        //read var from parent class
        System.out.println(b1.a);
    }


}
