package STRINGS;

import java.util.Arrays;

public class sortinstring {
    public static void main(String[] args) {

        String s = "hardik";

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        System.out.println(new String(arr));
    }
}