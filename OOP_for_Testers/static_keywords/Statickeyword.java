package OOP_for_Testers.static_keywords;

public class Statickeyword {

    static int a=40;
    int b;

    static void m1(){
        System.out.println("this is static method");
    }

    void m2(){
        System.out.println("this is non-static methods");
    }

    //we can access static and non-static variable from non-static method
    void m3(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }


    public static void main(String[] args) {
        //we can access static methods and variable without creating object
        System.out.println(a);
        m1();


        //we can access static methods and variable with creating object
        Statickeyword s1=new Statickeyword();
        System.out.println(s1.b);
        s1.m2();

    }
}
