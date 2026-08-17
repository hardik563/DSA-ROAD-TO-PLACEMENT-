package STRINGS;

public class internings {
    public static void main(String[] args) {
        String str="hardik";
        //change hardik to rohit
        //cannot change as  they are immutable
        str="hardikk";
        System.out.println(str);

    }
}
