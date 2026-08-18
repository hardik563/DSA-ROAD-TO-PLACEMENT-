package ARRAYS;

public class kadane {
    public static void Kadanes(int[] arr){
        System.out.println("kadane algorithm:");
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0)
            {
            }
                {
            cs=0;
        }
        ms=Math.max(cs,ms);

    }
        System.out.println("MAXIMUM SUM OF ARRAY IS "+ms);
}
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(arr);
}
}