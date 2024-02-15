
public class Method_Overloading {
    public int sum(int x, int y) { return (x + y); }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double
    // parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }
    public static void main(String[] args) {
        Method_Overloading m1=new Method_Overloading();
        System.out.println(m1.sum(2,3));
        Method_Overloading m2=new Method_Overloading();
        System.out.println(m2.sum(2,3,4));
    }
}
