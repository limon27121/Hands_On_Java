package OOP_for_Testers.Inheritance;

class c1{
    int number01=20;
    void display(){
        System.out.println(number01);
    }
}

class c2 extends c1{
    int number02=30;

    @Override
    void display() {
        super.display();
        System.out.println(number02);
    }
}

class c3 extends c2{
    int number03=40;

    @Override
    void display() {
        super.display();
        System.out.println(number03);
    }
}


public class Multilevel_inheritance {
    public static void main(String[] args) {
        c3 ins1=new c3();
        ins1.display();
    }
}
