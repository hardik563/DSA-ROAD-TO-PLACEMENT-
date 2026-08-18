package TIME_COMPLEXITY;

public class timepractise {
    public static void main(String[] args) {
        int n=19;
        for (int i = 0; i < n; i++) {

            System.out.print(i);
        }
        System.out.println();
        //tc will be O(n)
// if sqrt then tc will be log(logn)

        for (int i = 0; i < n; i*=i) {
            // for this also tc will be O(log n)
            System.out.println(i);
        }
    }
}
