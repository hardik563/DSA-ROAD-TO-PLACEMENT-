package STRINGS;
import java.util.*;
public class countvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR STRING:");
        String str;
        str=sc.nextLine();
        int count=0;
        for (char i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;

            }
        }
            System.out.println(count);

    }
}
