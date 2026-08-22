import java.util.*;
public class unique_path {
    public static int uniquePaths(int m, int n) {
        int i = 0;
        int j = 0;
        int x = recall(m, n, i, j);

        return x;
    }
    public static int recall(int m, int n, int i, int j) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (i >= m || j >= n) {

            return 0;
            
        }
        int down = recall(m, n, i + 1, j);
        int right = recall(m, n, i, j + 1);
        return down + right;


    }
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        System.out.println(uniquePaths(m, n));
    }
}