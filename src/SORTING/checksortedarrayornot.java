package SORTING;

public class checksortedarrayornot {
    public static void main(String[] args) {


        //check array sorted or not
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                break;

            }

            else{
                System.out.println("ARRAY IN SORTED:");
            }

        }

    }
}
