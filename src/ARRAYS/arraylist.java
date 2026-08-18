package ARRAYS;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {


        ArrayList<Integer>arr= new ArrayList<>();
        arr.add(0,4);
        arr.add(1,2);
        arr.add(2,5);
        System.out.println(arr);
        arr.set(1,30);
        arr.add(2,60);
        System.out.println(arr);
        arr.remove(Integer.valueOf(9));
        System.out.println(arr);

    }
}
