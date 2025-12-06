import java.util.ArrayList;

public class List {
   //ArrayList:
    //Heterogenious data allow
    //duplicate elements=allowed
    //multiple nulls=allowed
    public static void main(String[] args) {
        //Declaration
        ArrayList<Object>list1=new ArrayList<>();
      ArrayList<Integer>list=new ArrayList<Integer>();

      //adding data in arraylist
        list.add(10);
        list.add(20);
        list1.add(20);
        list1.add("welcome");
        list.add(3,45);

        //size of arraylist
        System.out.println("here is size of  array list: "+list.size());

        //print of arraylist
        System.out.println("here is list1:"+list1);
        System.out.println("here is list:"+list);

        // remove array-list
        list.remove(0);
        System.out.println("after the remove element from arraylist"+list.size());

    }
}
