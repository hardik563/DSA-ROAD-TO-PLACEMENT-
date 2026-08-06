package ARRAYS;

public class smallestandsecond {
    public static void smallestandsecondd(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                secondsmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(secondsmallest);
    }

    public static void main(String[] args) {
        int [] arr={9,3,5,4,8,1};
        smallestandsecondd(arr);

    }
}
