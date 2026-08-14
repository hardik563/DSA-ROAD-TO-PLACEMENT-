package ARRAYS;
import java.util.*;
public class houserobber_1 {
    public static void main(String[] args) {

        int arr[]={1,2,3,1};
        int n=arr.length;

        int sum=0;
        int sum1=0;
        for(int i=0;i<n;i=i+2) {
            sum = sum + arr[i];
        }

        for(int i=1;i<n;i=i+2) {
            sum1 = sum1 + arr[i];
        }
        if(sum>sum1) {
            System.out.println(sum);
        }
            else{
                System.out.println(sum1);
            }
        }
    }

