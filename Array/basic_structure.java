package Array;

public class basic_structure {
    public static void main(String[] args) {
        int a []=new int[5];
        a[0]=1;
        a[2]=3;

        int a1[]={1,2,3,4,5};

        System.out.println("array length: "+a1.length);

        System.out.println("read single element from array: "+a1[0]);

        for (int i=0;i<a1.length;i++){
            System.out.println("elements of array: "+a1[i]);
        }

         Object data[]={1,10.5,'c',"limon"};
        for (Object x:data){
            System.out.println("print the object array: "+x);
        }

    }
}
