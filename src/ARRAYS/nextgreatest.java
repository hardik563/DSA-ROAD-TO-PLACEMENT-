package ARRAYS;

public class nextgreatest {
    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
// method 1 brute force
        //      int[] ans = new int[n];
        //   ans[n - 1] = -1;

        //   for(int i = 0; i < n - 1; i++) {
        //    int mx = Integer.MIN_VALUE;
//
        //     for(int j = i + 1; j < n; j++) {
        //         mx = Math.max(mx, arr[j]);
        //      }

        //     ans[i] = mx;
        //  }


//METHOD 2 OPTIMISED
            int[] ans = new int[n];

            ans[n - 1] = -1;

            int nge = arr[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                ans[i] = nge;
                nge = Math.max(nge, arr[i]);
            }

            // Print answer
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }

        // original
        //for(int i = 0; i < n; i++) {
           // System.out.print(arr[i] + " ");
        //}

      //  System.out.println();

        // next greatest
      //  for(int i = 0; i < ans.length; i++) {
      //      System.out.print(ans[i] + " ");
      //  }
 //   }
//}