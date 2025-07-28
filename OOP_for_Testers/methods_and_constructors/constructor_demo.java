package OOP_for_Testers.methods_and_constructors;

public class constructor_demo {
    int id;
    String name;
    String password;
    int id2;

    //method
    void display(){
        System.out.println("id is:"+id);
        System.out.println("name is:"+name);
        System.out.println("passwprd is:"+password);
    }

    void sum(){
        int sum1=id+id2;
        System.out.println("sum is:"+sum1);
    }

    //constructor
    constructor_demo(int id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }

    constructor_demo(int id,int id2){
        this.id=id;
        this.id2=id2;
    }
}
