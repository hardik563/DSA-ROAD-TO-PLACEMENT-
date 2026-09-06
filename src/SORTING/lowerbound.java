package SORTING;

public class lowerbound {
    public static void main(String[] args) {
        int []arr={10,20,30,30,40,40,40,50};
        int target=40;
        int start=0;
        int end=arr.length-1;
        int x=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) {
                x=mid;
                end = mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(x);
    }
}
