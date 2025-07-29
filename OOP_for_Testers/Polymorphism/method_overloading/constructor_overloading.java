package OOP_for_Testers.Polymorphism.method_overloading;

public class constructor_overloading {
    double width,height,depth;

    constructor_overloading(){
        width=height=depth=0;
    }

    constructor_overloading(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    constructor_overloading(double length){
        width=height=depth=length;
    }

    void volume(){
        double volume=width*height*depth;
        System.out.println("volume is:"+volume);
    }
}
