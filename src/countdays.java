public class countdays {
    public static void main(String[] args) {

        int day = 1;
        int mweight = 32;

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (sum > mweight) {
                day++;
                sum = arr[i];
            }
        }

        System.out.println(day);
    }
}