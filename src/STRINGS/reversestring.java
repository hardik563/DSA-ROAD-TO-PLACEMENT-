package STRINGS;


public class reversestring {
    public static void main(String[] args) {

        String s = "Hardik";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println(rev);
    }
}