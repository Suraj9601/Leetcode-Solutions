class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        if(n == 0) return;

        k = k % n;

        int left = 0;
        int right = n - 1;

        reverse(nums, left, right);
        reverse(nums, left, k-1);
        reverse(nums, k, right);
    }

    public void reverse(int[] nums, int left, int right) {
        int temp;
        while(left <= right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}