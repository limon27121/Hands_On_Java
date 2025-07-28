package OOP_for_Testers.basic;

public class structure_class_and_object {

    //variable
    int emp_id;
    String emp_name;
    int emp_salary;

    //methods
    public void display(){
        System.out.println("employee id:"+emp_id);
        System.out.println("employee name:"+emp_name);
        System.out.println("employee salary:"+emp_salary);
    }

    //main method
    public static void main(String[] args) {
        //create object
        structure_class_and_object emp1=new structure_class_and_object();

        //
        emp1.emp_name="limon";
        emp1.emp_id=1;
        emp1.emp_salary=25000;

        emp1.display();

    }
}
