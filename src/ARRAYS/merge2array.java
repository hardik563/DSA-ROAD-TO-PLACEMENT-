package ARRAYS;

public class merge2array {
    public static void main(String[] args) {
        int []arr={4,6,8,10};
        int[]arr1={5,9,1,98};
        int m=arr.length;
        int n=arr1.length;
        int []o=new int [m+n];
        int i=0;
        int j=0;
        int k=0;
        //mergearray
        while(i<m && j<n){
//merge of 2 array
            if(arr[i]<arr1[j]) {
                o[k] = arr[i];
                i++;

            }

            else{
                o[k]=arr1[j];
                j++;
            }
            k++;
        }
        if(i==arr.length){
            while(j<arr1.length){
                o[k]=arr1[j];
                j++;
                k++;
            }
        }
        for(int x=0;x<k;x++){
            System.out.print(o[x]+" ");
        }

    }
}
