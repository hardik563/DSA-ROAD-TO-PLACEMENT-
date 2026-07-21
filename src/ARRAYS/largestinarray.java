package ARRAYS;

public class largestinarray {

    public static int largestInarray(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Largest and Second Largest
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }

            // Smallest
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("SMALLEST VALUE IS = " + smallest);
        System.out.println("SECOND LARGEST VALUE IS = " + slargest);

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 9, 23, 45, -6, 2};

        System.out.println("LARGEST VALUE IS = " + largestInarray(arr));

    }
}