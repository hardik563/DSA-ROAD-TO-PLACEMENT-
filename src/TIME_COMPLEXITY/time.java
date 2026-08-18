package TIME_COMPLEXITY;

public class time {
    public static void main(String[] args) {
        // for a loop moving till 1 to n or 0 to n
        //then the tc will be big o of n O(n)
        int n=10;
        int m=20;
        for (int i = 0; i < n; i++) {
            System.out.println(i);

        }
        for (int i = 0; i < n+3; i++) {
            System.out.println(i);

        }
        for (int i = 0; i < 200; i++) {
            //tc is O(1) constant time
            System.out.println(i);

        }
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = i;
            System.out.println(b[i]);
// tc will be O(n+m)
            //as first loop working till n and second loop moving till m
        }
        //loop inside another loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("OKAY");

                //tc will be O(nm)
                //nested loop multiply both tc

            }
            // O(n^3)>O(n^2)
            // it is faster

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("hello");

            }

        }

    }
}
