package OOP_for_Testers.methods_and_constructors;

public class methods_main {
    public static void main(String[] args) {
        Method instance1=new Method();
        instance1.m1();
        String value01=instance1.m2();
        System.out.println(value01);
        instance1.m3("limon");
        int value02=instance1.m4(10);
        System.out.println(value02);
    }
}
