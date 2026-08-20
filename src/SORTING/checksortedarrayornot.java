package SORTING;

public class checksortedarrayornot {

    public static void main(String[] args) {

        // check array sorted or not
        int[] arr = {1, 2, 3, 5, 4, 6};
        int n = arr.length;

        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("ARRAY IS SORTED");
        } else {
            System.out.println("ARRAY IS NOT SORTED");
        }
    }
}