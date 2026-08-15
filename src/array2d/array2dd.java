package array2d;

public class array2dd  {
    public static void main(String[] args) {
        int [][]arr=new int[3][3];
        arr[0][0]=10;
        arr[0][1]=101;
        arr[0][2]=120;
        arr[1][0]=1;
        arr[1][1]=23;
        arr[1][2]=67;
        arr[2][0]=56;
        arr[2][1]=45;
        arr[2][2]=23;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }

    }
}
