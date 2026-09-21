class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i = n-1;i>=0;i--) {
            if(mp.containsKey(target-nums[i])) {
                return new int[]{i, mp.get(target-nums[i])};
            }
            mp.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
