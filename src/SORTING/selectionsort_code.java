package SORTING;

public class selectionsort_code {
    //for i to n-2
    //inner loop
    //i+1 to n-1
    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //printing of array after bubble sort
        }
        System.out.println();
    }

        public static void main(String[] args) {
        int[] arr={4,1,5,2,3,6};
        selectionsort(arr);
    }
}
