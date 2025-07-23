package Array;

import java.util.Arrays;

public class Array_Method {
    public static void main(String[] args) {

//        Arrays.toString()

        int[] arr = {5, 3, 9, 1};
        System.out.println(Arrays.toString(arr));

        //Arrays.sort()

        int[] arr1 = {5, 3, 9, 1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


//        Arrays.copyOf()

        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);
        System.out.println(Arrays.toString(copy));

        //Arrays.equals()
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b));

        //Arrays.fill()
        int[] arr3 = new int[5];
        Arrays.fill(arr3, 7);
        System.out.println(Arrays.toString(arr3));

        //Arrays.binarySearch()

        int[] arr4 = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(arr4, 5);
        System.out.println("Index of 5: " + index);

        //array length
        System.out.println(arr.length);
    }
}
