class Demo {
    private int age=21;
    private String name;

    //getter method which is used for get the value
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //setter method which is used for set the value
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {

       name = name;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.setAge(25);
        System.out.println(d1.getAge());
    }
}
