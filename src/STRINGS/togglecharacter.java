package STRINGS;

public class togglecharacter {
    public static void main(String[] args) {

        // make small big and big small
        String s = "Hardik Is";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
                ch = (char) ascii;
            } else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
                ch = (char) ascii;
            }

            System.out.print(ch);
        }
    }
}