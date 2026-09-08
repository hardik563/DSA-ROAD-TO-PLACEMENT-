package RECURSION;

public class maze {
    public static int mazePath(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        return mazePath(r - 1, c) + mazePath(r, c - 1);
    }

    public static void main(String[] args) {
        System.out.println(mazePath(3, 3));
    }
}