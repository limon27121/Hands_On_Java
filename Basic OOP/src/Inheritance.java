class Base {
    // Constructor of the base class
    int x=10;
    public Base() {
        System.out.println("Hello from base class");
    }
    public Base(int x,int y){
        System.out.println("another constuctor with 2 varible from base class");
    }
     void Print(){
        System.out.println("tatata");
    }
}
class Derived extends Base{
    int y=50;
    int sum=0;
    public Derived(){

        System.out.println("hello from derived class");
    }
    public Derived(int x,int y){
        super(x,y);
        System.out.println("another constructor of dervied class");
    }
    public int sum(){
        return sum=y+super.x;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        // Creating an instance of the Base class
        Base b1 = new Base();
        Derived d1=new Derived();
        Derived d2=new Derived(3,4);
        d2.Print();
        System.out.println(d1.sum());
        Base b2=new Base(4,5);



    }
}
