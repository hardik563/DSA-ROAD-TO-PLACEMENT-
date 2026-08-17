package STRINGS;

public class returntotaldigitnoloop {
    public static void main(String[] args) {
        String s = "hardik12345";

        int count = s.replaceAll("[^0-9]", "").length();

        System.out.println(count);
    }
}