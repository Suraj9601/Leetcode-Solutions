class Solution {
    public int search(int[] nums, int target) {
        if(Arrays.binarySearch(nums, target) < -1) {
            return -1;
        }
        return Arrays.binarySearch(nums, target);
    }
}