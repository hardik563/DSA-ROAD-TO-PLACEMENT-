package ARRAYS;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < n; i = i + 2) {
            sum = sum + nums[i];
        }

        for (int i = 1; i < n; i = i + 2) {
            sum1 = sum1 + nums[i];
        }

        int sum2 = 0;

        for (int i = 0; i < n - 1; i = i + 2) {
            sum2 = sum2 + nums[i];
        }

        if (sum > sum1 && sum > sum2) {
            return sum;
        } else if (sum1 > sum2) {
            return sum1;
        } else {
            return sum2;
        }
    }
}