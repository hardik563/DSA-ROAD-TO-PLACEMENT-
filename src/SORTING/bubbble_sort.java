package SORTING;

public class bubbble_sort {
    //bubble sort
    //{5,2,4,3,1]
    //increasing[1,2,3,4,5]
    //decreasing[5,4,3,2,1]
    //compare one by one and send first big at possible last
    public static void bubbleSort(int[] arr){


        for (int turn=0;turn<arr.length-1;turn++){
           for(int j=0;j<arr.length-1-turn;j++){
              if(arr[j]>arr[j+1]){
                  //swap of largest and pushing it to last
                  int temp=arr[j];
                  //the one which is largest always go at last in first turn
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
           }
        }
    }
    public static void printArr(int []arr){
        for(int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
            //printing of array after bubble sort
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr={3,5,4,2,1};
        bubbleSort(arr);
        printArr(arr);

    }
}
