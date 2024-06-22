class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;

        Map<Integer, Integer> sumFrequency = new HashMap<>();
        sumFrequency.put(0, 1);
        for(int i=0; i < nums.length; i++)
            nums[i] = (nums[i] & 1) == 1 ? 1 : 0;

        int prefixSum = 0, count = 0;
        for (int num : nums) {
            prefixSum += num;
            sumFrequency.put(prefixSum, sumFrequency.getOrDefault(prefixSum, 0) + 1);

            if (sumFrequency.containsKey(prefixSum - k))
                count += sumFrequency.get(prefixSum - k);
        }
        return count;
    }
}