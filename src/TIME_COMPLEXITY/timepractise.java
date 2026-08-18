package TIME_COMPLEXITY;

public class timepractise {
    public static void main(String[] args) {
        int c=0;
        int n=5;
        for (int i = 0; i < n; i++) {
            c++;

        }
        System.out.println(c);
        //tc will be O(n)
// if sqrt then tc will be log(logn)

        for (int i = 0; i < n; i+=i) {
            // for this also tc will be O(log n)
            System.out.println(i);
        }

    }
}
