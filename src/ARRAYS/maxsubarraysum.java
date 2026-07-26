package ARRAYS;

public class maxsubarraysum {
    public static void maxsum(int []arr){
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                current=0;
                for(int k=start;k<=end;k++){
                    current+=arr[k];
                }
                System.out.println("current sum ="+current);
                if(max<current){
                    max=current;
                }
            }
        }
        System.out.println("MAXIMUM SUM IS="+max);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        maxsum(arr);

    }
}
