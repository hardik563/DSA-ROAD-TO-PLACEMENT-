package SORTING;

public class bubble_practise {
    public static void bubbleeee(int [] arr){

        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=arr[j];
                }
            }
        }
    }
}
