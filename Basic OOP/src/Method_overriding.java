class Animal{
    public void bark(){
        System.out.println("animal barking");
    }
    public void move(){
        System.out.println("animal is moving");
    }
    public void eat(){
        System.out.println("animal is eating");
    }
}
class cat extends Animal{
    @Override
    public void bark() {
        super.bark();
        System.out.println("meow");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("cat moveing slowly");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.bark();
        cat c1=new cat();
        c1.bark();
    }

}
