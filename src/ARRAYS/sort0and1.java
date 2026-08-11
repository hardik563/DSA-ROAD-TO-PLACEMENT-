package ARRAYS;

public class sort0and1 {
    public static void main(String[] args) {
        int []arr={0,1,0,0,0,1,0,1,1,0,1,0,1,1,1,0,0,1,0,1,0,1,0};
        int n=arr.length;
        int no0=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0)
            no0++;

        }
        for(int i=0;i<n;i++){
            if(i<no0)
            arr[i]=0;
            else
                arr[i]=1;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
