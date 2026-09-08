package SORTING;

public class koko {
    public static int koko(int[] arr, int k) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                ans += arr[i] / k;
            } else {
                ans += arr[i] / k + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        int k = 5;

        System.out.println(koko(arr, k));
    }
}
