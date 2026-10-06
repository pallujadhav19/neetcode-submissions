class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] output = new int[n];

        // Product of elements on the left
        int left = 1;

        for (int i = 0; i < n; i++) {
            output[i] = left;
            left = left * nums[i];
        }

        // Product of elements on the right
        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * right;
            right = right * nums[i];
        }

        return output;
    }
}  
