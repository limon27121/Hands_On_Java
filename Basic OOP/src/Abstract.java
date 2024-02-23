abstract class shape{
    int x=5;
    abstract void draw();
    void pattern(){
        System.out.println("pattern decleare here ");
    }


}
class circle extends shape{
    @Override
    void draw() {

        System.out.println("circle draw");
    }
   @Override
    void pattern(){

       System.out.println("pattern is circle");
   }
}
public class Abstract {
    public static void main(String[] args) {

        circle c1=new circle();
        c1.draw();
        c1.pattern();
    }
}
