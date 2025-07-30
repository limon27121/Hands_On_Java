package OOP_for_Testers.Inheritance;

class Parent{
    int a=20;
    void display(){
        System.out.println("print from parent class:"+a);
    }
}

class child01 extends Parent{
    int b=30;

    @Override
    void display() {
        super.display();
        System.out.println("print from child01 class"+b);
    }
}

class child02 extends Parent{
    int c=40;
    void sum(){
        int sum=c+super.a;
        System.out.println("sum is:"+sum);
    }
}


public class hierarchy_inheritance {
    public static void main(String[] args) {
     child02 p1=new child02();
     p1.sum();
     p1.display();
    }
}
