class Solution {
    public int majorityElement(int[] nums) {

        // int candidate = 0;
        // int count = 0;

        // for (int num : nums) {

        //     if (count == 0) {
        //         candidate = num;
        //     }

        //     if (num == candidate) {
        //         count++;
        //     } else {
        //         count--;
        //     }
        // }

        // return candidate;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}