package TIME_COMPLEXITY;

public class time {
    public static void main(String[] args) {
        // for a loop moving till 1 to n or 0 to n
        //then the tc will be big o of n O(n)
        int n=10;
        for (int i = 0; i < n; i++) {
            System.out.println(i);

        }
        for (int i = 0; i < n+3; i++) {
            System.out.println(i);

        }
    }
}
