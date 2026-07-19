class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); // value, index
        }

        for (int i = 0; i < nums.length; i++) {
            int jVal = target - nums[i];
            int j = map.getOrDefault(jVal, -1);
            if (j != -1 && i != j) {
                return new int[] {i, j};
            }
        }

        throw new IllegalArgumentException("Two Sum solution doesn't exist");
    }
}
