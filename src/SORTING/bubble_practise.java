package SORTING;

public class bubble_practise {
    public static void bubbleeee(int [] arr) {

        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arr[j];
                }
            }
        }
        System.out.println("AFTER USING BUBBLE SORT THE ARRAY WILL BE:");
    }

        public static  void printArr(int []arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }

    public static void main(String[] args) {
       int []arr={5,2,4,3,1,6};
       bubbleeee(arr);
       printArr(arr);

    }
}
