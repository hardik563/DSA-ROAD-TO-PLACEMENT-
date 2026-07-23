package ARRAYS;

public class binarysearch {
    public static int Binarysearch(int []arr,int key){
        int start=0;
        int end=arr.length;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;

            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arr={2,4,6,8,10,12,14,16,18,20};
        int key=4;
        System.out.println("index at which key is present=" + Binarysearch(arr,key));
    }
}
